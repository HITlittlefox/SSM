package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {
    //    @Value("lxl")
    public String name;

    @Value("lxl2")
    public void setName(String name) {
        this.name = name;
    }
}
