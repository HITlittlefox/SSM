package com.lxl.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//编写 Mybatis 工具类 获取SqlSessionFactory
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory = null;

    static{//静态代码块封装   从一开始就会加载
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream =  Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取sqlSession  对象
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}

