package cn.xdc.service;

import cn.xdc.bean.Order;
import cn.xdc.bean.User;
import cn.xdc.bean.query.OrderQuery;
import cn.xdc.bean.vo.InvestigationVo;
import cn.xdc.bean.vo.OrderVo;
import cn.xdc.common.page.Pagination;
import cn.xdc.dao.InvestigationDao;
import cn.xdc.dao.OrderDao;
import cn.xdc.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
    @Resource
    private UserDao userDao;
    @Resource
    private InvestigationDao investigationDao;
    @Resource
    private OrderDao orderDao;

    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }

    public void deleteOrderByKey(Integer id) {
        orderDao.deleteOrderByKey(id);
    }

    public void deleteOrderByKeys(Integer[] ids) {
        orderDao.deleteOrderByKeys(ids);
    }

    public void updateOrderByKey(Order order) {
        orderDao.updateOrderByKey(order);
    }

    public Order getOrderByKey(Integer id) {
        return orderDao.getOrderByKey(id);
    }

    @Transactional(readOnly = true)
    public List<OrderVo> getOrderList(OrderQuery orderQuery) {
        List<OrderVo> orderList = orderDao.getOrderList(orderQuery);
        packageOrderList(orderList);
        return orderList;
    }

    @Transactional(readOnly = true)
    public Pagination getOrderListWithPage(OrderQuery orderQuery) {
        Pagination p = new Pagination(orderQuery.getPageNo(),orderQuery.getPageSize(),orderDao.getOrderListCount(orderQuery));
        List<OrderVo> orders = orderDao.getOrderListWithPage(orderQuery);
        packageOrderList(orders);
        p.setList(orders);
        return p;
    }

    // 封装订单返回信息
    private void packageOrderList(List<OrderVo> orderList){

        Iterator<OrderVo> iterator = orderList.iterator();
        while (iterator.hasNext()){
            OrderVo next = iterator.next();

            Integer invId = next.getInvId();
            Integer userId = next.getUserId();

            if (invId != null){
                InvestigationVo investigationByKey = investigationDao.getInvestigationByKey(invId);
                if (investigationByKey != null){
                    next.setInvName(investigationByKey.getInvName());
                }
            }
            if (userId != null){
                User userByKey = userDao.getUserByKey(userId);
                next.setUserName(userByKey.getName());
            }

        }

    }

}
