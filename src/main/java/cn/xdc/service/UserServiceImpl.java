package cn.xdc.service;

import cn.xdc.bean.User;
import cn.xdc.bean.query.UserQuery;
import cn.xdc.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void deleteUserByKey(Integer id) {
        userDao.deleteUserByKey(id);
    }

    public void deleteUserByKeys(Integer[] ids) {
        userDao.deleteUserByKeys(ids);
    }

    public void updateUserByKey(User user) {
        userDao.updateUserByKey(user);
    }

    public User getUserByKey(Integer id) {
        return userDao.getUserByKey(id);
    }

    public List<User> getUserList(UserQuery userQuery) {
        return userDao.getUserList(userQuery);
    }
}
