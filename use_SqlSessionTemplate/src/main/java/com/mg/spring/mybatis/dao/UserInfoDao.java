package com.mg.spring.mybatis.dao;

import com.mg.spring.mybatis.entity.UserInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserInfoDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    /**
     * 新 增方法
     * 此处的方法名必须和mapper中的映射文件中的id同名
     * 回去映射文件中通过com.dlz.spring.mybatis.dao.UserDao.getUser,即this.getClass().getName()+".insertUser"
     *
     * @param userInfo
     */
    public void insertUser(UserInfo userInfo) {
        sqlSessionTemplate.insert(this.getClass().getName()+".insertUser",userInfo);
    }
}
