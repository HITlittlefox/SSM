package com.lxl.dao;


import com.lxl.pojo.User;
import com.lxl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

public class UserMapperCache {
    @Test
    public void testQueryUserById() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);

        session.close();
    }

    @Test
    public void testQueryUserById1() {
        SqlSession session = MybatisUtils.getSqlSession();
        SqlSession session2 = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserMapper mapper2 = session2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);

        session.close();
        session2.close();
    }

    @Test
    public void testQueryUserById2() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserMapper mapper2 = session.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        User user2 = mapper2.queryUserById(2);
        System.out.println(user2);
        System.out.println(user == user2);

        session.close();
    }


    @Test
    public void testQueryUserById3() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        HashMap map = new HashMap();
        map.put("name", "kuangshen");
        map.put("id", 4);
        mapper.updateUser(map);

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);

        session.close();
    }

    @Test
    public void testQueryUserById4() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        session.clearCache();//手动清除缓存

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);

        session.close();
    }

    @Test
    public void testQueryUserByIdSecond() {
        SqlSession session = MybatisUtils.getSqlSession();
        SqlSession session2 = MybatisUtils.getSqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        UserMapper mapper2 = session2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        session.close();

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);

        session2.close();
    }
}

