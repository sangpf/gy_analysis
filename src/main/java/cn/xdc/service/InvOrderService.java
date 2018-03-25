package cn.xdc.service;

import cn.xdc.bean.InvOrder;
import cn.xdc.bean.query.InvOrderQuery;

import java.util.List;

/**
 *
 * @author sang
 *
 */
public interface InvOrderService {
	//查询集合
	public List<InvOrder> getInvOrderList(InvOrderQuery entityQuery);
	//添加
	public void addInvOrder(InvOrder entity);
	//删除
	public void deleteInvOrderByKey(Integer id);
	//删除 批量
	public void deleteInvOrderByKeys(Integer[] ids); //List<Integer>  ids
	//修改
	public void updateInvOrderByKey(InvOrder entity);
	//根据id 查询
	public InvOrder getInvOrderByKey(Integer id);
}
