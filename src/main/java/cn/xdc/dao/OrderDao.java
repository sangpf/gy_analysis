package cn.xdc.dao;

import cn.xdc.bean.Order;
import cn.xdc.bean.query.OrderQuery;
import cn.xdc.bean.vo.OrderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author sang
 *
 */
@Mapper
public interface OrderDao {
	//查询集合
	public List<OrderVo> getOrderList(OrderQuery orderQuery);

	//分页查询
	public List<OrderVo> getOrderListWithPage(OrderQuery orderQuery);

	//查询总记录数
	public int getOrderListCount(OrderQuery orderQuery);

	//添加
	public void addOrder(Order order);
	
	//删除
	public void deleteOrderByKey(Integer id);
	//删除 批量
	public void deleteOrderByKeys(Integer[] ids); //List<Integer>  ids

	//修改
	public void updateOrderByKey(Order order);

	//根据 id查询
	public Order getOrderByKey(Integer id);
}
