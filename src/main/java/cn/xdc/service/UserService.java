package cn.xdc.service;

import cn.xdc.bean.User;
import cn.xdc.bean.query.UserQuery;

import java.util.List;

/**
 *
 * @author sang
 *
 */
public interface UserService {
	//查询集合
	public List<User> getUserList(UserQuery entityQuery);
	//添加
	public void addUser(User entity);
	//删除
	public void deleteUserByKey(Integer id);
	//删除 批量
	public void deleteUserByKeys(Integer[] ids); //List<Integer>  ids
	//修改
	public void updateUserByKey(User entity);
	//根据id 查询
	public User getUserByKey(Integer id);
}
