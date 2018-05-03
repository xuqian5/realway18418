package cn.com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.pojo.User;
import cn.com.service.UserService;

public class Demo1 {
@Test
 public void test01(){
  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");//º”‘ÿ≈‰÷√Œƒº˛
  UserService us=(UserService) context.getBean("userService");
  us.addUser(new User(0, "zhangsan","123456" ));
 }
}
