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
	this.userDao.save(user);//��������������ݷ��ʲ�
 }  
}
