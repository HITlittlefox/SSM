package com.lxl.demo1;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
//        host.rent();
        //代理
        //代理会加一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
