package com.lxl.dao;

import com.lxl.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper04 {

    // 根据ID查询用户
    User getUserById(int id);

    // mybatis实现分页
    List<User> getUserListByLimit(Map<String, Integer> map);

}
