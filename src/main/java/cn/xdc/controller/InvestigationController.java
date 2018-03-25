package cn.xdc.controller;

import cn.xdc.bean.Answer;
import cn.xdc.bean.InvOrder;
import cn.xdc.bean.Investigation;
import cn.xdc.bean.User;
import cn.xdc.bean.query.AnswerQuery;
import cn.xdc.bean.query.InvOrderQuery;
import cn.xdc.bean.query.InvestigationQuery;
import cn.xdc.bean.vo.InvestigationVo;
import cn.xdc.bean.vo.StatisticsDetailVo;
import cn.xdc.bean.vo.UserInfo_InvVo;
import cn.xdc.service.AnswerService;
import cn.xdc.service.InvOrderService;
import cn.xdc.service.InvestigationService;
import cn.xdc.service.UserService;
import cn.xdc.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 数据查询 -- 调查
 */
@RequestMapping(value = "/investigation")
@Controller
public class InvestigationController {
    @Autowired
    private InvestigationService investigationService;
    @Autowired
    private AnswerService answerService;
    @Autowired
    private InvOrderService invOrderService;
    @Autowired
    private UserService userService;

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期格式
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    // 统计明细查询
    @ResponseBody
    @RequestMapping(value = "/list_statistics_detail.do")
    public AjaxResult list_statistics_detail(Integer invId){
        AnswerQuery answerQuery = new AnswerQuery();
        answerQuery.setInvId(invId);
        //查询 answer表 , 准备原始数据
        List<Answer> answerList = answerService.getAnswerList(answerQuery);

        // 将用户进行排序 分组 , 使用比较器
        Collections.sort(answerList , new Comparator<Answer>(){
            @Override
            public int compare(Answer o1, Answer o2) {
                if (o1.getUserId() > o2.getUserId()){
                    return 1;
                }else if (o1.getUserId() < o2.getUserId()){
                    return -1;
                }else {
                    if (o1.getQId() > o2.getQId()){
                        return 1;
                    }else {
                        return -1;
                    }
                }
            }
        });

        // 重新封装数据
        List<StatisticsDetailVo> list_StatisticsDetailVo = new ArrayList<>();

        StatisticsDetailVo statisticsDetailVo = null;
        Integer last_userId = null;

        Iterator<Answer> iterator = answerList.iterator();
        while (iterator.hasNext()){
            Answer cur_Answer = iterator.next();

            Integer cur_userId = cur_Answer.getUserId();
            if (!cur_userId.equals(last_userId)){
                // 如果当前用户不是最后 一个用户 , 说明上一个用户信息已经录入完毕, 可以加入 列表中
                if (statisticsDetailVo != null){
                    list_StatisticsDetailVo.add(statisticsDetailVo);
                }

                last_userId = cur_userId;
                // 新来个用户
                statisticsDetailVo = new StatisticsDetailVo();

                statisticsDetailVo.setId(cur_Answer.getId());
                statisticsDetailVo.setUserId(cur_userId);
                statisticsDetailVo.setQId(cur_Answer.getQId());
                statisticsDetailVo.setQType(cur_Answer.getQType());
                statisticsDetailVo.setResUrl(cur_Answer.getResUrl());
                statisticsDetailVo.setChoices(cur_Answer.getChoices());
                statisticsDetailVo.setAnsDescription(cur_Answer.getAnsDescription());
                statisticsDetailVo.setMatrixId(cur_Answer.getMatrixId());
                statisticsDetailVo.setOderId(cur_Answer.getOderId());
                statisticsDetailVo.setInvId(cur_Answer.getInvId());
            }

            //组装答案显示字符串
            String answer = new String();
            if(cur_Answer.getChoices()!=null){
                answer += cur_Answer.getChoices()+" ";
            }
            //获取题号
            int QuestionNum = 1;
            if(cur_Answer.getQId()!=0){
                QuestionNum = cur_Answer.getQId();
            }
            //通过反射调用对应的set方法
            try {
                statisticsDetailVo.getClass().getMethod("setQuestion"+QuestionNum, String.class).invoke(statisticsDetailVo, answer);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        if (statisticsDetailVo != null){
            list_StatisticsDetailVo.add(statisticsDetailVo);
        }

        return AjaxResult.successData(list_StatisticsDetailVo);
    }

    // 单个调查  人员明细
    @ResponseBody
    @RequestMapping(value = "/list_inv_user.do")
    public AjaxResult list_UserInfo_Investigation(Integer invId, HttpServletResponse response){
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

        return AjaxResult.successData(userInfo_Inv_list);
    }

    // 查询调查收集信息列表
    @ResponseBody
    @RequestMapping(value = "/list_inv.do")
    public AjaxResult list_inv(HttpServletResponse response){

        List<InvestigationVo> investigation_list_data = get_investigation_list_data();
        return AjaxResult.successData(investigation_list_data);
    }

    // 导出数据到 excel
    @RequestMapping(value = "/download_excel_list_inv.do")
    public void download_excel_list_inv(HttpServletResponse response){

        List<InvestigationVo> investigation_list_data = get_investigation_list_data();

        LinkedHashMap<String, String> fieldMap = new LinkedHashMap<String, String>();
        fieldMap.put("userId", "用户ID");
        fieldMap.put("wanxUserId", "玩校用户ID");
        fieldMap.put("qnId", "问卷");
        fieldMap.put("qId", "问题id");
        fieldMap.put("gender", "性别");
        fieldMap.put("questionType", "问题类型");

        fieldMap.put("wanxNickname", "玩校昵称");
        fieldMap.put("schoolName", "学校名称");
        fieldMap.put("regionName", "地区");
        fieldMap.put("showTitle", "标题");
        fieldMap.put("qTitle", "问题标题");

        try {
            ExcelExportUtil.listToExcel(investigation_list_data,fieldMap,"标题",response);
        } catch (ExcelException e) {
            e.printStackTrace();
        }

    }

    // 数据查询 , 返回调查列表
    private List<InvestigationVo> get_investigation_list_data(){
        InvestigationQuery investigationQuery = new InvestigationQuery();
//        investigationQuery.setInvId(1);
//        investigationQuery.setInvName("人口调查");
//        investigationQuery.setInvNameLike(true);

        List<InvestigationVo> investigationList = investigationService.getInvestigationList(investigationQuery);

        Iterator<InvestigationVo> iterator = investigationList.iterator();
        AnswerQuery answerQuery = new AnswerQuery();
        while (iterator.hasNext()){
            InvestigationVo next = iterator.next();
            // 设置组长姓名
            User user = userService.getUserByKey(next.getGroupLeaderId());
            if (user != null){
                next.setGroupLeaderName(user.getName());
            }

            answerQuery.setInvId(next.getInvId());
            List<Answer> answerList = answerService.getAnswerList(answerQuery);

            // 目前采集分数
            Integer collectNum = answerList.size();
            // 目标收集分数
            Integer totalNum = next.getTotalNum();
            // 计算采集完成度 百分比
//            Float collectionSchedule = Float.valueOf(collectNum / totalNum) * 100;
            double collectionSchedule = MathUtil.div(collectNum, totalNum, 2);

            // 剩余天数
            Long distanceDays = DateUtil.getDistanceDays(next.getETime(), new Date());

            next.setCollectionNum(collectNum);
            next.setCollectionSchedule(MathUtil.getPercentInstance(collectionSchedule,2));  // 56.7%
            next.setDistanceDays(distanceDays);

        }
        return investigationList;
    }

}
