package com.lxl.dao;

import com.lxl.pojo.User;
import com.lxl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class UserMapper02Test {
    @Test
    public void test() {
        //获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //从接口的反射类 获得相应的 mapper
        UserMapper02 mapper = sqlSession.getMapper(UserMapper02.class);

        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭资源
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper02 mapper = sqlSession.getMapper(UserMapper02.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }


    // 增删改需要提交事务
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper02 mapper = sqlSession.getMapper(UserMapper02.class);
        int res = mapper.addUser(new User(7, "小总", "1234"));
        if (res > 0) {
            System.out.println("insert success");
        }
        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }


    // 增删改需要提交事务
    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper02 mapper = sqlSession.getMapper(UserMapper02.class);
        int res = mapper.updateUser(new User(4, "小总22", "1234"));
        if (res > 0) {
            System.out.println("insert success");
        }
        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    // 增删改需要提交事务
    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper02 mapper = sqlSession.getMapper(UserMapper02.class);
        int res = mapper.deleteUser(4);
        if (res > 0) {
            System.out.println("insert success");
        }
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }


}

