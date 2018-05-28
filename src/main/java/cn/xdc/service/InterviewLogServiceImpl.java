package cn.xdc.service;

import cn.xdc.bean.InterviewLog;
import cn.xdc.bean.query.InterviewLogQuery;
import cn.xdc.bean.vo.InterviewLogVo;
import cn.xdc.common.page.Pagination;
import cn.xdc.dao.InterviewLogDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class InterviewLogServiceImpl implements InterviewLogService{

    @Resource
    private InterviewLogDao interviewLogDao;

    public void addInterviewLog(InterviewLog interviewLog) {
        interviewLogDao.addInterviewLog(interviewLog);
    }

    public void deleteInterviewLogByKey(Integer id) {
        interviewLogDao.deleteInterviewLogByKey(id);
    }

    public void deleteInterviewLogByKeys(Integer[] ids) {
        interviewLogDao.deleteInterviewLogByKeys(ids);
    }

    // 清理
    public void clearInterviewLogByKeys(){
        interviewLogDao.clearInterviewLogByKeys();
    }

    public void updateInterviewLogByKey(InterviewLog interviewLog) {
        interviewLogDao.updateInterviewLogByKey(interviewLog);
    }

    public InterviewLog getInterviewLogByKey(Integer id) {
        return interviewLogDao.getInterviewLogByKey(id);
    }

    @Transactional(readOnly = true)
    public List<InterviewLogVo> getInterviewLogList(InterviewLogQuery interviewLogQuery) {
        return interviewLogDao.getInterviewLogList(interviewLogQuery);
    }

    @Transactional(readOnly = true)
    public Pagination getInterviewLogListWithPage(InterviewLogQuery interviewLogQuery) {
        Pagination p = new Pagination(interviewLogQuery.getPageNo(),interviewLogQuery.getPageSize(),interviewLogDao.getInterviewLogListCount(interviewLogQuery));
        List<InterviewLogVo> interviewLogs = interviewLogDao.getInterviewLogListWithPage(interviewLogQuery);

        p.setList(interviewLogs);
        return p;
    }

}
