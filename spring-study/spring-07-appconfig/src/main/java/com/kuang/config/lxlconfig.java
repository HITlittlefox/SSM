package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@import(lxlconfig2.class)
//@Configuraiton
@ComponentScan
public class lxlconfig {


    @Bean
    public User getUser() {
        return new User();
    }
}
