package org.example.lab1.question6.one;

import java.lang.reflect.Method;

public class MyInterCepter implements Intercepter{
    int num;
    People people;

    public MyInterCepter(People people) {
        this.people = people;
        num = 0;
    }

    @Override
    public void before(Method method,Object[] args) {
        People renter = (People) args[0];
        House house = (House) args[1];
        System.out.println(people.getName() + "正在办理为" + renter.getName() + "出租手续");
        System.out.println("=======================================");
    }

    @Override
    public void after() {
        num++;
        System.out.println("查询数据库获取已交易记录数为" + num);
    }
}
