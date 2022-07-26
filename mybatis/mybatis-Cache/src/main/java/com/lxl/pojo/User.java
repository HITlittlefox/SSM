package com.lxl.pojo;

import lombok.Data;
import org.apache.ibatis.annotations.Param;

@Data
public class User {
    private int id;
    private String name;
    private String pwd;


}
