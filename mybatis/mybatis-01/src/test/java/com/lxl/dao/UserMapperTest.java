package com.lxl.dao;

import com.lxl.pojo.User;
import com.lxl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test() {
        //获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //从接口的反射类 获得相应的 mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

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
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    // Like
    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        String value = "%蓝%";
        List<User> userList = mapper.getUserLike(value);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    //    <!--根据 密码 和 名字 查询用户-->
    @Test
    public void getUserByNameandPwd() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        String value = "%蓝%";
        User user = mapper.getUserByNameandPwd("小明", "123456");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUserById2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid", 5);
        map.put("username", "小华");
        System.out.println(mapper.getUserById2(map));

        sqlSession.close();
    }

    // 增删改需要提交事务
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(4, "小总", "1234"));
        if (res > 0) {
            System.out.println("insert success");
        }
        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }


    // 万能Map，增删改需要提交事务
    @Test
    public void addUserByMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid", 6);
        map.put("username", "小华");
        mapper.addUserByMap(map);
        // 提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    // 增删改需要提交事务
    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
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
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(4);
        if (res > 0) {
            System.out.println("insert success");
        }
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}