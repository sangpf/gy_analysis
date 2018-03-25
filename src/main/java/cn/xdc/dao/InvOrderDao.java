package cn.xdc.dao;

import cn.xdc.bean.InvOrder;
import cn.xdc.bean.query.InvOrderQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author sang
 *
 */
@Mapper
public interface InvOrderDao {
	//查询集合
	public List<InvOrder> getInvOrderList(InvOrderQuery entityQuery);

	//查询总记录数
	public int getInvOrderCount(InvOrder entity);
	//添加
	public void addInvOrder(InvOrder entity);
	
	//删除
	public void deleteInvOrderByKey(Integer id);
	//删除 批量
	public void deleteInvOrderByKeys(Integer[] ids); //List<Integer>  ids
	//修改
	public void updateInvOrderByKey(InvOrder entity);

	//根据 id查询
	public InvOrder getInvOrderByKey(Integer id);
}
