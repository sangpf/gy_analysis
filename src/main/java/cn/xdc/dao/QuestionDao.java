package cn.xdc.dao;

import cn.xdc.bean.Question;
import cn.xdc.bean.query.QuestionQuery;
import cn.xdc.bean.vo.QuestionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author sang
 *
 */
@Mapper
public interface QuestionDao {
	//查询集合
	public List<QuestionVo> getQuestionList(QuestionQuery questionQuery);

	//分页查询
	public List<QuestionVo> getQuestionListWithPage(QuestionQuery questionQuery);

	//查询总记录数
	public int getQuestionListCount(QuestionQuery questionQuery);

	//添加
	public void addQuestion(Question question);
	
	//删除
	public void deleteQuestionByKey(Integer id);
	//删除 批量
	public void deleteQuestionByKeys(Integer[] ids); //List<Integer>  ids

	//修改
	public void updateQuestionByKey(Question question);

	//根据 id查询
	public Question getQuestionByKey(Integer id);
}
