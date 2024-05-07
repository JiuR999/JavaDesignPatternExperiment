package cn.swust.lab1.question6.two.pojo;

import cn.swust.lab1.question6.two.impl.Observer;

// 租客类，作为观察者
public class Tenant implements Observer {
    private String name;

    public Tenant(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到消息：" + message);
    }
}