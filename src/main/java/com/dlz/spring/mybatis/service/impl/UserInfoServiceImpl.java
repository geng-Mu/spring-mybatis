package com.dlz.spring.mybatis.service.impl;

import com.dlz.spring.mybatis.dao.UserInfoDao;
import com.dlz.spring.mybatis.entity.UserInfo;
import com.dlz.spring.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    public String insertUser(UserInfo userInfo) {
        userInfoDao.insertUser(userInfo);
        return "FAILURE";
    }
}
