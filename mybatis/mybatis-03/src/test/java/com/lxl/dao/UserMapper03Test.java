package com.lxl.dao;

import com.lxl.pojo.User;
import com.lxl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapper03Test {


    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper03 mapper = sqlSession.getMapper(UserMapper03.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }


}

