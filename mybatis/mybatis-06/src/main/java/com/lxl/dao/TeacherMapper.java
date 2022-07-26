package com.lxl.dao;

import com.lxl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    @Select("select * from mybatis.teacher where id = #{tid} ")
    Teacher getTeacher(@Param("tid") int id);
}
