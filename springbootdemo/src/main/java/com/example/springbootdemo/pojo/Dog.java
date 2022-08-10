package com.example.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //注册bean到容器中
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    @Value("阿黄")
    private String name;
    @Value("18")
    private Integer age;

    //有参无参构造、get、set方法、toString()方法
}