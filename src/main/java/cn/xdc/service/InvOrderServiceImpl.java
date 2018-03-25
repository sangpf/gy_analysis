package cn.xdc.service;

import cn.xdc.bean.InvOrder;
import cn.xdc.bean.query.InvOrderQuery;
import cn.xdc.dao.InvOrderDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InvOrderServiceImpl implements InvOrderService{

    @Resource
    private InvOrderDao invOrderDao;

    public void addInvOrder(InvOrder invOrder) {
        invOrderDao.addInvOrder(invOrder);
    }

    public void deleteInvOrderByKey(Integer id) {
        invOrderDao.deleteInvOrderByKey(id);
    }

    public void deleteInvOrderByKeys(Integer[] ids) {
        invOrderDao.deleteInvOrderByKeys(ids);
    }

    public void updateInvOrderByKey(InvOrder invOrder) {
        invOrderDao.updateInvOrderByKey(invOrder);
    }

    public InvOrder getInvOrderByKey(Integer id) {
        return invOrderDao.getInvOrderByKey(id);
    }

    public List<InvOrder> getInvOrderList(InvOrderQuery invOrderQuery) {
        return invOrderDao.getInvOrderList(invOrderQuery);
    }
}
