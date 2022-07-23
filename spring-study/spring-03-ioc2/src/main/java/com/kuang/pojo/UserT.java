package com.kuang.pojo;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT的无参构造");
    }
//    public UserT(String name) {
//        this.name = name;
//    }

    public void show() {
        System.out.println("name: " + this.name);
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }
}
