package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    //映射访问路径
    @RequestMapping("/commit/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable int p2, Model model) {
        int result = p1 + p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果：" + result);
        //返回视图位置
        return "test";

    }

    //映射访问路径
    // 通过，http://localhost:8080/posttest.jsp
    // 点击提交按钮，提交表单，转移到路径
    // http://localhost:8080/post/12/34
    @RequestMapping(value = "/post/{p1}/{p2}", method = {RequestMethod.POST})
    public String testPost(@PathVariable int p1, @PathVariable int p2, Model model) {
        int result = p1 + p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果：" + result);
        //返回视图位置
        return "test";

    }    //映射访问路径

//    // 直接在地址栏输入http://localhost:8080/get/12/34
//    @RequestMapping(value = "/get/{p1}/{p2}", method = {RequestMethod.GET})
//    public String testGet(@PathVariable int p1, @PathVariable int p2, Model model) {
//        int result = p1 + p2;
//        //Spring MVC会自动实例化一个Model对象用于向视图中传值
//        model.addAttribute("msg", "结果：" + result);
//        //返回视图位置
//        return "test";
//
//    }

    // 直接在地址栏输入http://localhost:8080/get/12/34
    @GetMapping("/get/{p1}/{p2}")
    public String testGet(@PathVariable int p1, @PathVariable int p2, Model model) {
        int result = p1 + p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果：" + result);
        //返回视图位置
        return "test";

    }

    //映射访问路径,必须是POST请求
    @RequestMapping(value = "/hellopost", method = {RequestMethod.POST})
    public String index2(Model model) {
        model.addAttribute("msg", "hellopost!");
        return "test";
    }


    //映射访问路径,必须是Get请求
    @RequestMapping(value = "/helloget", method = {RequestMethod.GET})
    public String index3(Model model) {
        model.addAttribute("msg", "helloget!");
        return "test";
    }

}