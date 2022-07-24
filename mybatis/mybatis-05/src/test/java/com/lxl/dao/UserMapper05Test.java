package com.lxl.dao;

import com.lxl.pojo.User;
import com.lxl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapper05Test {


    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper05 mapper = sqlSession.getMapper(UserMapper05.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUserById2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper05 mapper = sqlSession.getMapper(UserMapper05.class);
        List<User> user = mapper.getUserList();
        for (User peruser : user) {
            System.out.println(peruser);
        }
        sqlSession.close();
    }


    @Test
    public void insertUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper05 mapper = sqlSession.getMapper(UserMapper05.class);
        User user = new User(10, "小", "123457");
        mapper.insertUser(user);

        sqlSession.close();
    }

}

