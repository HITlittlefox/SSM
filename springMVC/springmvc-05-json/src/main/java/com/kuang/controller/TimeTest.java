package com.kuang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kuang.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimeTest {
    @RequestMapping("/utilTimetest")
    public String json5() throws JsonProcessingException {
        Date date = new Date();
        String json = JsonUtils.getJson(date);
        return json;
    }
}
