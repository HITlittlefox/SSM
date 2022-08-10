package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class TestController {
    @RequestMapping("/h1")
    public String test(Model model) {
        model.addAttribute("msg", "ControllerTest路径");
        return "test";
    }
}
// http://localhost:8080/admin/h1