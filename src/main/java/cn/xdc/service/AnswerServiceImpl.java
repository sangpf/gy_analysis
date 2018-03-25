package cn.xdc.service;

import cn.xdc.bean.Answer;
import cn.xdc.dao.AnswerDao;
import cn.xdc.bean.query.AnswerQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{

    @Resource
    private AnswerDao answerDao;

    public void addAnswer(Answer answer) {
        answerDao.addAnswer(answer);
    }

    public void deleteAnswerByKey(Integer id) {
        answerDao.deleteAnswerByKey(id);
    }

    public void deleteAnswerByKeys(Integer[] ids) {
        answerDao.deleteAnswerByKeys(ids);
    }

    public void updateAnswerByKey(Answer answer) {
        answerDao.updateAnswerByKey(answer);
    }

    public Answer getAnswerByKey(Integer id) {
        return answerDao.getAnswerByKey(id);
    }

    public List<Answer> getAnswerList(AnswerQuery answerQuery) {
        return answerDao.getAnswerList(answerQuery);
    }
}
