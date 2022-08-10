package com.example.springbootdemo;

import com.example.springbootdemo.pojo.Dog;
import com.example.springbootdemo.pojo.Person;
import com.example.springbootdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootdemoApplicationTests {
    @Autowired //将狗狗自动注入进来
    Dog dog;

    @Test
    public void contextLoads() {
        System.out.println(dog); //打印看下狗狗对象
    }


    @Autowired
    Person person; //将person自动注入进来

    @Test
    public void contextLoads2() {
        System.out.println(person); //打印person信息
    }


    @Autowired
    User user;

    @Test
    public void contextLoads3() {
        System.out.println(user);
    }
}
