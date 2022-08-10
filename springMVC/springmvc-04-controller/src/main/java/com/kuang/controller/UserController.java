package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("/user")
    public String user(User user, Model model) {
        System.out.println(user);
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果：" + user.getName());
        return "test";
    }
}
