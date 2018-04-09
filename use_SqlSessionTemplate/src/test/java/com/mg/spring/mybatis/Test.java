package com.mg.spring.mybatis;

import com.mg.spring.mybatis.entity.UserInfo;
import com.mg.spring.mybatis.service.UserInfoService;
import com.mg.spring.mybatis.service.impl.UserInfoServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        applicationContext.start();
        UserInfoService userInfoService = (UserInfoServiceImpl)applicationContext.getBean("userInfoServiceImpl");
        UserInfo userInfo = new UserInfo();
        userInfo.setName("测试");
        userInfoService.insertUser(userInfo);
        System.out.println(userInfo.toString());
    }
}
