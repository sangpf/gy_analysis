package cn.xdc.service;

import cn.xdc.bean.InterviewLog;
import cn.xdc.bean.query.InterviewLogQuery;
import cn.xdc.bean.vo.InterviewLogVo;
import cn.xdc.common.page.Pagination;

import java.util.List;

/**
 *
 * @author sang
 *
 */
public interface InterviewLogService {
	//查询集合
	public List<InterviewLogVo> getInterviewLogList(InterviewLogQuery interviewLogQuery);

	// 根据条件查询分页查询
	public Pagination getInterviewLogListWithPage(InterviewLogQuery projectQuery);

	//添加
	public void addInterviewLog(InterviewLog interviewLog);
	//删除
	public void deleteInterviewLogByKey(Integer id);
	//删除 批量
	public void deleteInterviewLogByKeys(Integer[] ids); //List<Integer>  ids

    //清理
    void clearInterviewLogByKeys();

	//修改
	public void updateInterviewLogByKey(InterviewLog interviewLog);

	//根据id 查询
	public InterviewLog getInterviewLogByKey(Integer id);
}
