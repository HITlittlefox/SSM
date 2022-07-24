package com.lxl.dao;

import com.lxl.pojo.User;
import com.lxl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapper04Test {

    static Logger logger = Logger.getLogger(UserMapper04Test.class);

    @Test
    public void log4jtest() {

        logger.info("info:进入了info");
        logger.error("error:进入了error");
        logger.debug("debug:进入了debug");

    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper04 mapper = sqlSession.getMapper(UserMapper04.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    //实现分页测试
    @Test
    public void getUserListByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper04 mapper = sqlSession.getMapper(UserMapper04.class);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        List<User> userList = mapper.getUserListByLimit(map);

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }


}

