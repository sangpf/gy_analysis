package cn.xdc.dao;

import cn.xdc.bean.InterviewLog;
import cn.xdc.bean.query.InterviewLogQuery;
import cn.xdc.bean.vo.InterviewLogVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author sang
 *
 */
@Mapper
public interface InterviewLogDao {
	//查询集合
	public List<InterviewLogVo> getInterviewLogList(InterviewLogQuery interviewLogQuery);

	//分页查询
	public List<InterviewLogVo> getInterviewLogListWithPage(InterviewLogQuery interviewLogQuery);

	//查询总记录数
	public int getInterviewLogListCount(InterviewLogQuery interviewLogQuery);

	//添加
	public void addInterviewLog(InterviewLog interviewLog);
	
	//删除
	public void deleteInterviewLogByKey(Integer id);
	//删除 批量
	public void deleteInterviewLogByKeys(Integer[] ids); //List<Integer>  ids

    // clear
    void clearInterviewLogByKeys();

	//修改
	public void updateInterviewLogByKey(InterviewLog interviewLog);

	//根据 id查询
	public InterviewLog getInterviewLogByKey(Integer id);
}
