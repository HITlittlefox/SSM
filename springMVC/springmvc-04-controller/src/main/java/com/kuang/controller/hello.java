package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class hello {
    //@RequestParam("username") : username提交的域的名称 .
    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String name, Model model) {
        System.out.println(name);
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果：" + name);
        return "test";
    }
}
