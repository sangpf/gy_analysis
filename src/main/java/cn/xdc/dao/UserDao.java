package cn.xdc.dao;

import cn.xdc.bean.User;
import cn.xdc.bean.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author sang
 *
 */
@Mapper
public interface UserDao {
	//查询集合
	public List<User> getUserList(UserQuery entityQuery);

	//查询总记录数
	public int getUserCount(User entity);
	//添加
	public void addUser(User entity);
	
	//删除
	public void deleteUserByKey(Integer id);
	//删除 批量
	public void deleteUserByKeys(Integer[] ids); //List<Integer>  ids
	//修改
	public void updateUserByKey(User entity);

	//根据 id查询
	public User getUserByKey(Integer id);
}
