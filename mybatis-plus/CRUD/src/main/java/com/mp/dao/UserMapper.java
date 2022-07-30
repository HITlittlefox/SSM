package com.mp.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.mp.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    // 自定义, 参数的注解是固定的 ew 就是WRAPPER的值
//    @Select("select * from user ${ew.customSqlSegment}")
    List<User> selectAll(@Param(Constants.WRAPPER) Wrapper<User> wrapper);

}
