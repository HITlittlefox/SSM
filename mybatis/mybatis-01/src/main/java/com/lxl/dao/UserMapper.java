package com.lxl.dao;

import com.lxl.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询全部用户
    List<User> getUserList();

    // 根据ID查询用户
    User getUserById(int id);

    User getUserById2(Map<String, Object> map);


    // insert 一个用户
    int addUser(User user);

    // 万能的Map
    int addUser2(Map<String, Object> map);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
