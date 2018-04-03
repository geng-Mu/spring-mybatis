package com.mg.spring.mybatis;

import com.mg.spring.mybatis.dao.UserInfoDao;
import com.mg.spring.mybatis.entity.UserInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[]   args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        applicationContext.start();
        UserInfoDao userInfoDao = (UserInfoDao) applicationContext.getBean("userInfoDao");
        UserInfo userInfo = new UserInfo();
        userInfo.setName("测试");
        userInfoDao.insertUser(userInfo);
        System.out.println(userInfo.toString());
    }
}
