package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelMapTest {
    @RequestMapping("/ModelMapTest")
    public String hello(@RequestParam("username") String name, ModelMap model) {
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("name", name);
        System.out.println(name);
        return "test";
    }
}
