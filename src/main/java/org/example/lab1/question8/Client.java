package org.example.lab1.question8;

import java.lang.management.ManagementFactory;

public class Client {
    public static void main(String[] args) {
        IdentityCard instance = IdentityCard.getInstance();
        //模拟补办
        System.out.println("=============================");
        System.out.println("补办身份证");
        IdentityCard nIdentityCard = IdentityCard.getInstance();
        System.out.print("身份证号码是否一致？");
        System.out.println(instance.getIdNumber() == nIdentityCard.getIdNumber());

        System.out.println("第一次身份证号码:" + instance.getIdNumber());
        System.out.println("第二次身份证号码:" + nIdentityCard.getIdNumber());

        System.out.print("内容是否相等?");
        System.out.println(instance.equals(nIdentityCard));

        System.out.print("是否为同一对象？");
        System.out.println(instance == nIdentityCard);
    }
}
