package cn.xdc.service;

import cn.xdc.bean.Question;
import cn.xdc.bean.query.QuestionQuery;
import cn.xdc.bean.vo.QuestionVo;
import cn.xdc.common.page.Pagination;
import cn.xdc.dao.QuestionDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService{

    @Resource
    private QuestionDao questionDao;

    public void addQuestion(Question question) {
        questionDao.addQuestion(question);
    }

    public void deleteQuestionByKey(Integer id) {
        questionDao.deleteQuestionByKey(id);
    }

    public void deleteQuestionByKeys(Integer[] ids) {
        questionDao.deleteQuestionByKeys(ids);
    }

    public void updateQuestionByKey(Question question) {
        questionDao.updateQuestionByKey(question);
    }

    public Question getQuestionByKey(Integer id) {
        return questionDao.getQuestionByKey(id);
    }

    @Transactional(readOnly = true)
    public List<QuestionVo> getQuestionList(QuestionQuery questionQuery) {
        return questionDao.getQuestionList(questionQuery);
    }

    @Transactional(readOnly = true)
    public Pagination getQuestionListWithPage(QuestionQuery questionQuery) {
        Pagination p = new Pagination(questionQuery.getPageNo(),questionQuery.getPageSize(),questionDao.getQuestionListCount(questionQuery));
        List<QuestionVo> questions = questionDao.getQuestionListWithPage(questionQuery);

        p.setList(questions);
        return p;
    }

}
