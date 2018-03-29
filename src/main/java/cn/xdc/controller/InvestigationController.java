package cn.xdc.controller;

import cn.xdc.bean.*;
import cn.xdc.bean.query.AnswerQuery;
import cn.xdc.bean.query.InvOrderQuery;
import cn.xdc.bean.query.InvestigationQuery;
import cn.xdc.bean.vo.InvestigationVo;
import cn.xdc.bean.vo.StatisticsDetailVo;
import cn.xdc.bean.vo.UserInfo_InvVo;
import cn.xdc.common.page.Pagination;
import cn.xdc.service.*;
import cn.xdc.utils.*;
import cn.xdc.utils.file.localZip.ZipUtils;
import cn.xdc.utils.file.zip.DownZipUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Logger;

/**
 * 数据查询 -- 调查
 */
@RequestMapping(value = "/investigation")
@Controller
public class InvestigationController {
    private static Logger log = Logger.getLogger(Object.class);

    @Autowired
    private InvestigationService investigationService;
    @Autowired
    private AnswerService answerService;
    @Autowired
    private InvOrderService invOrderService;
    @Autowired
    private UserService userService;
    @Autowired
    private QuestionService questionService;

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期格式
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    //===================================统计明细=== begin====================================
    // 下载统计明细查询 excel
    @RequestMapping(value = "/download_list_statistics_detail.do")
    public void download_list_statistics_detail(Integer invId,HttpServletRequest request,
                                                      HttpServletResponse response){
        if (invId != null){
            try {
                DownZipUtils.downLoadZip(response,request,invId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("===================>> 要下载的调查id为null");
        }
    }

    @RequestMapping(value = "/download_list_statistics_detail_excel.do")
    public void download_list_statistics_detail_excel(Integer invId,HttpServletResponse response){

        if (invId != null){
            List<InvestigationVo> investigations = package_list_statistics_detail(invId);

            LinkedHashMap<String, String> fieldMap = new LinkedHashMap<String, String>();
            fieldMap.put("inv_userName", "调查员姓名");
            fieldMap.put("inv_userGender", "调查员性别");
            fieldMap.put("collectionSchedule", "采集完成度");

            try {
                ExcelExportUtil.listToExcel(investigations,fieldMap,"invid_"+invId,response);
            } catch (ExcelException e) {
                e.printStackTrace();
            }
        }
    }

    // 统计明细查询
    @ResponseBody
    @RequestMapping(value = "/list_statistics_detail.do")
    public AjaxResult list_statistics_detail(Integer invId){
        if(invId == null){
            return AjaxResult.errorResult("缺少参数 invId");
        }
        List<InvestigationVo> investigations = package_list_statistics_detail(invId);

        return AjaxResult.successData(investigations);
    }

    // 统计明细查询
    private List<InvestigationVo> package_list_statistics_detail(Integer invId) {
        AnswerQuery answerQuery = new AnswerQuery();
        answerQuery.setInvId(invId);
        //查询 answer表 , 准备原始数据  所有用户的答案信息
        List<Answer> allUser_answerList = answerService.getAnswerList(answerQuery);

        // 将所有的用户取出
        List<Integer> userList = new ArrayList<>();   // 单个调查 存储所有用户id 列表

        Iterator<Answer> iterator_answerList_1 = allUser_answerList.iterator();
        while (iterator_answerList_1.hasNext()) {
            Answer next = iterator_answerList_1.next();
            Integer userId = next.getUserId();
            if (!userList.contains(userId)) {
                userList.add(userId);
            }
        }

        log.info("====================>> 统计明细查询,用户数量: " + userList.size());
        ArrayList<InvestigationVo> investigations = new ArrayList<>();

        // 遍历所有的用户, 每个用户创建一个调查对象
        Iterator<Integer> iterator_userList = userList.iterator();
        while (iterator_userList.hasNext()) {
            Integer cur_userId = iterator_userList.next();

            InvestigationVo investigation = investigationService.getInvestigationByKey(invId);

            // 封装调查员信息
            User userByKey = userService.getUserByKey(cur_userId);
            if (userByKey != null) {
                String name = userByKey.getName();
                Integer gender = userByKey.getGender();
                investigation.setInv_userName(name);
                investigation.setInv_userGender(gender);
            }

            // 遍历答案表 取出当前用户的所有答题信息, 单选多选, 填空 , 静态资源题
            // 将 问题封装进 调查 , 选项封装进问题

            // 遍历所有答案信息, 找出当前用户的答案
            Iterator<Answer> iterator_answerList_2 = allUser_answerList.iterator();

            // 存储当前用户的答案信息
            ArrayList<Answer> cur_user_answerList = new ArrayList<>();

            // 将 答案表 区分不同的问题 , 取出所有非重复的问题id
            while (iterator_answerList_2.hasNext()) {
                Answer next = iterator_answerList_2.next();
                if (next.getUserId().equals(cur_userId)) {
                    // 为当前用户的答案
                    cur_user_answerList.add(next);
                }
            }

            // 存储当前用户在该调查上 所有的问题id 的列表
            ArrayList<Integer> cur_user_answers_qid_list = new ArrayList<>();

            // 遍历当前用户的答案, 判断有多少个问题
            Iterator<Answer> iterator_cur_user_answers = cur_user_answerList.iterator();
            while (iterator_cur_user_answers.hasNext()) {
                Answer next = iterator_cur_user_answers.next();
                if (!cur_user_answers_qid_list.contains(next.getQId())) {
                    cur_user_answers_qid_list.add(next.getQId());
                }
            }
            log.info("===================>> 用户id " + cur_userId + " 的问题数量 : " + cur_user_answers_qid_list.size());

            // 遍历当前用户的所有问题 , 每个问题创建一个问题对象
            Iterator<Integer> iterator_cur_user_answers_qid_list = cur_user_answers_qid_list.iterator();

            // 存储当前用户问题列表
            List<Question> cur_user_answers_question_list = new ArrayList<>();

            while (iterator_cur_user_answers_qid_list.hasNext()) {
                // 当前用户 当前问题 id
                Integer cur_qId = iterator_cur_user_answers_qid_list.next();
                // 查询该问题的对象
                Question questionByKey = questionService.getQuestionByKey(cur_qId);

                // 当前用户, 当前问题上的答案
                Iterator<Answer> iterator_cur_user_answers_2 = cur_user_answerList.iterator();
                while (iterator_cur_user_answers_2.hasNext()) {
                    Answer next = iterator_cur_user_answers_2.next();
                    if (next.getQId().equals(cur_qId)) {
                        // 是当前用户, 当前问题
                        questionByKey.setChoices(next.getChoices());
                        questionByKey.setQType(next.getQType());
                        questionByKey.setResUrl(next.getResUrl());
                        questionByKey.setAnsDescription(next.getAnsDescription());
                    }
                }
                cur_user_answers_question_list.add(questionByKey);

            }
            investigation.setQuestionList(cur_user_answers_question_list);

            investigations.add(investigation);

        }
        return investigations;
    }
    //===================================统计明细=== end====================================

    //===================================人员明细===begin====================================
    //  下载 单个调查  人员明细
    @RequestMapping(value = "/download_excel_list_inv_user.do")
    public void download_excel_list_inv_user(Integer invId, HttpServletResponse response){
        List<UserInfo_InvVo> userInfo_Inv_list = packageIng_list_inv_user(invId);

        LinkedHashMap<String, String> fieldMap = new LinkedHashMap<String, String>();
        fieldMap.put("userId", "用户ID");
        fieldMap.put("userName", "姓名");
        fieldMap.put("collectionNum", "采集份数");
        fieldMap.put("proportion", "占比");
        fieldMap.put("isGroupLeader", "组长");
        fieldMap.put("phoneNum", "电话");

        try {
            ExcelExportUtil.listToExcel(userInfo_Inv_list,fieldMap,"标题",response);
        } catch (ExcelException e) {
            e.printStackTrace();
        }
    }

    // 单个调查  人员明细
    @ResponseBody
    @RequestMapping(value = "/list_inv_user.do")
    public AjaxResult list_UserInfo_Investigation(Integer invId, HttpServletResponse response){
        if (invId == null){
            return AjaxResult.errorResult("invId 为空");
        }
        List<UserInfo_InvVo> userInfo_Inv_list = packageIng_list_inv_user(invId);
        return AjaxResult.successData(userInfo_Inv_list);
    }

    public List<UserInfo_InvVo> packageIng_list_inv_user(Integer invId){
        InvOrderQuery invOrderQuery = new InvOrderQuery();
        invOrderQuery.setInvId(invId);
        List<InvOrder> invOrderList = invOrderService.getInvOrderList(invOrderQuery);

        // 封装页面显示数据 列表
        List<UserInfo_InvVo> userInfo_Inv_list = new ArrayList<>();
        // 计数列表
        List<Integer> userIdList = new ArrayList<>();

        // 从订单表中获取所有非重复用户id
        Iterator<InvOrder> iterator = invOrderList.iterator();
        while (iterator.hasNext()){
            InvOrder next = iterator.next();
            Integer userId = next.getUserId();

            // 查询用户信息
            User userByKey = userService.getUserByKey(userId);

            if (!userIdList.contains(userId)){
                userIdList.add(userId);
                // 如果不包含在列表中, 新增一个
                UserInfo_InvVo userInfo_invVo = new UserInfo_InvVo();
                userInfo_invVo.setUserId(userId);
                userInfo_invVo.setUserName(userByKey.getName());
                userInfo_invVo.setPhoneNum(userByKey.getTelephone());
                userInfo_invVo.setCollectionNum(1);

                userInfo_Inv_list.add(userInfo_invVo);
            }else {
                // 如果包含则, 修改计数
                // 找到指定 userid 的用户
                Iterator<UserInfo_InvVo> iterator1 = userInfo_Inv_list.iterator();
                while (iterator1.hasNext()){
                    UserInfo_InvVo next1 = iterator1.next();
                    Integer userId1 = next1.getUserId();
                    if (userId1 == userId){
                        next1.setCollectionNum(next1.getCollectionNum()+1);
                    }
                }
            }
        }

        // 查询调查信息
        Investigation investigationByKey = investigationService.getInvestigationByKey(invId);
        Integer groupLeaderId = investigationByKey.getGroupLeaderId();
        Integer totalNum = investigationByKey.getTotalNum();

        // 封装 组长和 收集份数占比
        Iterator<UserInfo_InvVo> iterator2 = userInfo_Inv_list.iterator();
        while (iterator2.hasNext()){
            UserInfo_InvVo next = iterator2.next();
            Integer userId = next.getUserId();
            if (userId == groupLeaderId){
                next.setIsGroupLeader(1);
            }
            // 计算 占比
            Integer collectionNum = next.getCollectionNum();
            double div = MathUtil.div(collectionNum, totalNum, 2);
            String percentInstance = MathUtil.getPercentInstance(div,2);

            next.setProportion(percentInstance);
        }
        return userInfo_Inv_list;
    }
    //===================================人员明细===end====================================

    //===================================所有调查列表===beign====================================
    // 查询调查收集信息列表
    @ResponseBody
    @RequestMapping(value = "/list_inv.do")
    public AjaxResult list_inv(Integer pageNo,HttpServletResponse response){
        if (pageNo == null){
            return AjaxResult.errorResult("error msg , pageNo is null");
        }

        InvestigationQuery investigationQuery = new InvestigationQuery();
        investigationQuery.setPageNo(pageNo);

        Pagination investigationListWithPage = investigationService.getInvestigationListWithPage(investigationQuery);

        return AjaxResult.successData(investigationListWithPage);
    }

    // 导出数据到 excel
    @RequestMapping(value = "/download_excel_list_inv.do")
    public void download_excel_list_inv(HttpServletResponse response){

        InvestigationQuery investigationQuery = new InvestigationQuery();
        List<InvestigationVo> investigationList = investigationService.getInvestigationList(investigationQuery);

        LinkedHashMap<String, String> fieldMap = new LinkedHashMap<String, String>();
        fieldMap.put("invId", "调查ID");
        fieldMap.put("invName", "调查名称");
        fieldMap.put("totalNum", "目标份数");
        fieldMap.put("collectionNum", "采集分数");
        fieldMap.put("collectionSchedule", "采集完成度");
        fieldMap.put("distanceDays", "剩余时间（天）");
        fieldMap.put("bTime", "开始日期");
        fieldMap.put("eTime", "截至日期");
        fieldMap.put("groupLeaderName", "组长姓名");
        fieldMap.put("invStatus", "调查状态");

        try {
            ExcelExportUtil.listToExcel(investigationList,fieldMap,"标题",response);
        } catch (ExcelException e) {
            e.printStackTrace();
        }
    }
    //===================================所有调查列表=== end ====================================

}
