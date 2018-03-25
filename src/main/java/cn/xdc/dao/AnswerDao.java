package cn.xdc.dao;

import cn.xdc.bean.Answer;
import cn.xdc.bean.query.AnswerQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author sang
 *
 */
@Mapper
public interface AnswerDao {
	//查询集合
	public List<Answer> getAnswerList(AnswerQuery entityQuery);

	//查询总记录数
	public int getAnswerCount(Answer entity);
	//添加
	public void addAnswer(Answer entity);
	
	//删除
	public void deleteAnswerByKey(Integer id);
	//删除 批量
	public void deleteAnswerByKeys(Integer[] ids); //List<Integer>  ids
	//修改
	public void updateAnswerByKey(Answer entity);

	//根据 id查询
	public Answer getAnswerByKey(Integer id);
}
