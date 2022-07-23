package com.lxl.demo1;

public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {

    }

    //看房
    public void seeHouse() {
        seeHouse();
        System.out.println("see house");
        hetong();
        fare();
    }

    //收中介费
    public void fare() {
        System.out.println("fare");
    }

    //签合同
    public void hetong() {
        System.out.println("hetong");
    }
}
