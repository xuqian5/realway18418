package cn.com.service;
import cn.com.dao.UserDao;
import cn.com.pojo.User;
public class UserServiceImpl implements UserService {
  private UserDao userDao;
  public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
 }
@Override
public void addUser(User user) {
	this.userDao.save(user);//服务层代码调用数据访问层
 }  
}
