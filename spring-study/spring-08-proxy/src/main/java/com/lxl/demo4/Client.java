package com.lxl.demo4;

import com.lxl.demo2.UserService;
import com.lxl.demo2.UserServiceImpl;

public class Client {

    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色，不存在
        // 代理对象的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(userService);
        // 动态生成代理类！
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }

}
