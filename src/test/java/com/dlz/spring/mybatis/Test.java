package com.dlz.spring.mybatis;

import com.dlz.spring.mybatis.dao.UserInfoDao;
import com.dlz.spring.mybatis.entity.UserInfo;
import com.dlz.spring.mybatis.service.UserInfoService;
import com.dlz.spring.mybatis.service.impl.UserInfoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[]   args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        applicationContext.start();
        UserInfoDao userInfoDao = (UserInfoDao) applicationContext.getBean("userInfoDao");
        UserInfo userInfo = new UserInfo();
        userInfo.setName("网联");
        userInfoDao.insertUser(userInfo);
        System.out.println(userInfo.toString());
    }
}
