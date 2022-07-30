package com.mp.dao;

import com.mp.Application;
import com.mp.entity.User;
import com.mp.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class InsertTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setName("刘明强2");
        user.setAge(31);
        user.setManagerId(1088248166370832385L);
//        user.setEmail("lmq@baomidou.com");
        user.setCreateTime(LocalDateTime.now());
//        user.setRemark("我是一个备注信息");
        int row = userMapper.insert(user);
        System.out.println("影响记录数：" + row);
        System.out.println("自增id: " + user.getId());
    }

}