package cn.xdc.controller;

import cn.xdc.bean.InterviewLog;
import cn.xdc.bean.query.InterviewLogQuery;
import cn.xdc.bean.vo.InterviewLogVo;
import cn.xdc.common.page.Pagination;
import cn.xdc.service.InterviewLogService;
import cn.xdc.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping(value = "/interviewLog")
@Controller
public class InterviewLogController {
    @Autowired
    private InterviewLogService interviewLogService;

    //添加
    @ResponseBody
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public AjaxResult add(InterviewLog interviewLog){
        try {
            interviewLogService.addInterviewLog(interviewLog);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.errorResult();
        }
        return AjaxResult.successResult();
    }

    //修改
    @ResponseBody
    @RequestMapping(value = "/edit.do")
    public AjaxResult edit(InterviewLog interviewLog,ModelMap model){
        try {
            interviewLogService.updateInterviewLogByKey(interviewLog);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.errorResult();
        }
        return AjaxResult.successResult();
    }

    //列表
    @ResponseBody
    @RequestMapping(value = "/list.do")
    public AjaxResult list(InterviewLog interviewLog, HttpServletResponse response){
        InterviewLogQuery interviewLogQuery = new InterviewLogQuery();
        List<InterviewLogVo> interviewLogList = interviewLogService.getInterviewLogList(interviewLogQuery);

        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("data",interviewLogList);
        return ajaxResult;
    }

    //分页列表
    @ResponseBody
    @RequestMapping(value = "/listWithPage.do")
    public AjaxResult ListWithPage(Integer pageNo,InterviewLog interviewLog){

        InterviewLogQuery interviewLogQuery = new InterviewLogQuery();
        //设置页号
        interviewLogQuery.setPageNo(Pagination.cpn(pageNo));
        //设置每页数
        interviewLogQuery.setPageSize(5);

        Pagination pagination = interviewLogService.getInterviewLogListWithPage(interviewLogQuery);

        return AjaxResult.successData(pagination);
    }

    //删除多个
    @ResponseBody
    @RequestMapping(value = "/deletes.do")
    public AjaxResult deletes(Integer[] ids,ModelMap model){
        try {
            interviewLogService.deleteInterviewLogByKeys(ids);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.errorResult();
        }
        return AjaxResult.successResult();
    }

    //删除多个
    @ResponseBody
    @RequestMapping(value = "/clear.do")
    public AjaxResult clear(Integer[] ids,ModelMap model){
        try {
            interviewLogService.clearInterviewLogByKeys();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.errorResult();
        }
        return AjaxResult.successResult();
    }

}
