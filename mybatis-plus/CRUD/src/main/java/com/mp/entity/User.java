package com.mp.entity;

import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("User")
public class User {
    @TableId
    private Long id;
    @TableField(condition = SqlCondition.LIKE)
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;
//    private transient String remark;
//    private static String remark;
//    @TableField(exist=false)
//    private static String remark;
}
