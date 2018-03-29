package cn.xdc.service;

import cn.xdc.bean.Answer;
import cn.xdc.bean.Investigation;
import cn.xdc.bean.User;
import cn.xdc.bean.query.AnswerQuery;
import cn.xdc.bean.query.InvestigationQuery;
import cn.xdc.bean.vo.InvestigationVo;
import cn.xdc.common.page.Pagination;
import cn.xdc.dao.AnswerDao;
import cn.xdc.dao.InvestigationDao;
import cn.xdc.dao.UserDao;
import cn.xdc.utils.DateUtil;
import cn.xdc.utils.MathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class InvestigationServiceImpl implements InvestigationService{

    @Resource
    private InvestigationDao investigationDao;
    @Resource
    private UserDao userDao;
    @Resource
    private AnswerDao answerDao;

    public void addInvestigation(Investigation investigation) {
        investigationDao.addInvestigation(investigation);
    }

    public void deleteInvestigationByKey(Integer id) {
        investigationDao.deleteInvestigationByKey(id);
    }

    public void deleteInvestigationByKeys(Integer[] ids) {
        investigationDao.deleteInvestigationByKeys(ids);
    }

    public void updateInvestigationByKey(Investigation investigation) {
        investigationDao.updateInvestigationByKey(investigation);
    }

    public InvestigationVo getInvestigationByKey(Integer id) {
        return investigationDao.getInvestigationByKey(id);
    }

    @Transactional(readOnly = true)
    public List<InvestigationVo> getInvestigationList(InvestigationQuery investigationQuery) {
        List<InvestigationVo> investigations = investigationDao.getInvestigationList(investigationQuery);
        packagingInvestigationVo(investigations);
        return investigations;
    }

    @Transactional(readOnly = true)
    public Pagination getInvestigationListWithPage(InvestigationQuery investigationQuery) {
        Pagination p = new Pagination(investigationQuery.getPageNo(),investigationQuery.getPageSize(),investigationDao.getInvestigationListCount(investigationQuery));

        List<InvestigationVo> investigations = investigationDao.getInvestigationListWithPage(investigationQuery);

        packagingInvestigationVo(investigations);
        p.setList(investigations);
        return p;
    }

    private void packagingInvestigationVo(List<InvestigationVo> investigations){

        Iterator<InvestigationVo> iterator = investigations.iterator();
        AnswerQuery answerQuery = new AnswerQuery();
        while (iterator.hasNext()){
            InvestigationVo next = iterator.next();
            // 设置组长姓名
            User user = userDao.getUserByKey(next.getGroupLeaderId());
            if (user != null){
                next.setGroupLeaderName(user.getName());
            }

            answerQuery.setInvId(next.getInvId());
            List<Answer> answerList = answerDao.getAnswerList(answerQuery);

            // 目前采集分数
            Integer collectNum = answerList.size();
            // 目标收集分数
            Integer totalNum = next.getTotalNum();
            // 计算采集完成度 百分比
//            Float collectionSchedule = Float.valueOf(collectNum / totalNum) * 100;
            double collectionSchedule = MathUtil.div(collectNum, totalNum, 2);

            // 剩余天数
            Long distanceDays = DateUtil.getDistanceDays(next.getDateETime(), new Date());

            next.setCollectionNum(collectNum);
            next.setCollectionSchedule(MathUtil.getPercentInstance(collectionSchedule,2));  // 56.7%
            next.setDistanceDays(distanceDays);
        }
    }

}
