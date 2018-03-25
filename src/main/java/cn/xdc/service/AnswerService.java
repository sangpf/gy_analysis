package cn.xdc.service;

import cn.xdc.bean.Answer;
import cn.xdc.bean.query.AnswerQuery;

import java.util.List;

/**
 *
 * @author sang
 *
 */
public interface AnswerService {
	//查询集合
	public List<Answer> getAnswerList(AnswerQuery entityQuery);
	//添加
	public void addAnswer(Answer entity);
	//删除
	public void deleteAnswerByKey(Integer id);
	//删除 批量
	public void deleteAnswerByKeys(Integer[] ids); //List<Integer>  ids
	//修改
	public void updateAnswerByKey(Answer entity);
	//根据id 查询
	public Answer getAnswerByKey(Integer id);
}
