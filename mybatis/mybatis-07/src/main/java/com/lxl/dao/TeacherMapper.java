package com.lxl.dao;

import com.lxl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    //    List<Teacher> getTeacher();
    public Teacher getTeacher(@Param("tid") int id);

    public Teacher getTeacher2(@Param("tid") int id);
}

