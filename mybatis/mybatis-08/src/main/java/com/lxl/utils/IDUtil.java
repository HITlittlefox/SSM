package com.lxl.utils;

import org.junit.Test;

import java.util.UUID;

public class IDUtil {

    public static String genId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test() {
        System.out.println(genId());
    }

}