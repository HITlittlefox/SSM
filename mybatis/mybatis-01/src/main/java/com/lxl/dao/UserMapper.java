package com.lxl.dao;

import com.lxl.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询全部用户
    List<User> getUserList();

    // 根据ID查询用户
    User getUserById(int id);

    List<User> getUserLike(String value);

    User getUserById2(Map<String, Object> map);

    // 根据 密码 和 名字 查询用户
    User getUserByNameandPwd(@Param("username") String username, @Param("pwd") String pwd);

    // insert 一个用户
    int addUser(User user);

    // 万能的Map，添加用户
    int addUserByMap(Map<String, Object> map);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
