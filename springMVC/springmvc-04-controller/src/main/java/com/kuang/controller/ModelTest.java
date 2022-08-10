package com.kuang.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ModelTest {
    @RequestMapping("/ct2/hello")
    public String hello(@RequestParam("username") String name, Model model) {
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("msg", name);
        System.out.println(name);
        return "test";
    }
}
