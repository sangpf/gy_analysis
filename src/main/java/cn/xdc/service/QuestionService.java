package cn.xdc.service;

import cn.xdc.bean.Question;
import cn.xdc.bean.query.QuestionQuery;
import cn.xdc.bean.vo.QuestionVo;
import cn.xdc.common.page.Pagination;

import java.util.List;

/**
 *
 * @author sang
 *
 */
public interface QuestionService {
	//查询集合
	public List<QuestionVo> getQuestionList(QuestionQuery questionQuery);

	// 根据条件查询分页查询
	public Pagination getQuestionListWithPage(QuestionQuery projectQuery);

	//添加
	public void addQuestion(Question question);
	//删除
	public void deleteQuestionByKey(Integer id);
	//删除 批量
	public void deleteQuestionByKeys(Integer[] ids); //List<Integer>  ids
	//修改
	public void updateQuestionByKey(Question question);

	//根据id 查询
	public Question getQuestionByKey(Integer id);
}
