package cn.xdc.service;

import cn.xdc.bean.Order;
import cn.xdc.bean.query.OrderQuery;
import cn.xdc.bean.vo.OrderVo;
import cn.xdc.common.page.Pagination;

import java.util.List;

/**
 *
 * @author sang
 *
 */
public interface OrderService {
	//查询集合
	public List<OrderVo> getOrderList(OrderQuery orderQuery);

	// 根据条件查询分页查询
	public Pagination getOrderListWithPage(OrderQuery projectQuery);

	//添加
	public void addOrder(Order order);
	//删除
	public void deleteOrderByKey(Integer id);
	//删除 批量
	public void deleteOrderByKeys(Integer[] ids); //List<Integer>  ids
	//修改
	public void updateOrderByKey(Order order);

	//根据id 查询
	public Order getOrderByKey(Integer id);
}
