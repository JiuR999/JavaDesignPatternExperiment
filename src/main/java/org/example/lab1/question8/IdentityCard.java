package org.example.lab1.question8;

public class IdentityCard {
    private static IdentityCard instance;
    private long idNumber;

    public static IdentityCard getInstance() {
        if (instance == null) {
            synchronized (IdentityCard.class) {
                if (instance == null) {
                    System.out.println("第一次办理身份证，分配新的号码!");
                    instance = new IdentityCard(Math.round(Math.random() * 1000));
                    System.out.println("身份证号码为:" + instance.getIdNumber());
                }
            }
        } else {
            System.out.println("重复办理身份证，获取旧号码!");
        }
        return instance;
    }

    private IdentityCard(long idNumber) {
        this.idNumber = idNumber;
    }

    public long getIdNumber() {
        return idNumber;
    }
}
