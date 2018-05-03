package cn.com.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.com.pojo.User;

public class UserDaoImpl implements UserDao {
  //springΪ�����ṩ��HibernateTemplate���� ������session���� ֮��Ҫspring������ע�� �����ṩset����
  private HibernateTemplate hibernateTemplate;
  public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
@Override
public void save(User user) {
	this.hibernateTemplate.save(user);
}
@Override
public void update(User user) {
	this.hibernateTemplate.update(user);
}
@Override
public void delete(Serializable id) {
	this.hibernateTemplate.delete(findbyid(id));
}
@Override
public User findbyid(Serializable id) {
	return this.hibernateTemplate.get(User.class, id);
}
@Override
public List<User> findall() {
	return (List<User>) this.hibernateTemplate.find("from User ",null);
}
  
}
