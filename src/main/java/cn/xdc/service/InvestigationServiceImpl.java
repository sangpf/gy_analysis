package cn.xdc.service;

import cn.xdc.bean.Investigation;
import cn.xdc.bean.vo.InvestigationVo;
import cn.xdc.dao.InvestigationDao;
import cn.xdc.bean.query.InvestigationQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InvestigationServiceImpl implements InvestigationService{

    @Resource
    private InvestigationDao investigationDao;

    public Investigation getInvestigationByKey(Integer id) {
        return investigationDao.getInvestigationByKey(id);
    }

    public List<InvestigationVo> getInvestigationList(InvestigationQuery investigationQuery) {
        return investigationDao.getInvestigationList(investigationQuery);
    }

}
