package com.lxl.dao;

import com.lxl.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper05 {

    @Select("select * from mybatis.users")
    List<User> getUserList();


    @Insert("insert into mybatis.users (id,name,pwd) values (#{id},#{name},#{password})")
    int insertUser(User user);

    @Delete("delete from mybatis.users where id = #{id}")
    int deleteUser(@Param("id") int id);

    @Update("update mybatis.users set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Select("select * from mybatis.users where id=#{id}")
    User getUserById(@Param("id") int id);

}
