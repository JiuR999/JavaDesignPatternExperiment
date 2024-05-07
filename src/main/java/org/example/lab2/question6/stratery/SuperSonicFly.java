package org.example.lab2.question6.stratery;

import org.example.lab2.question6.stratery.FlyStrategy;

public class SuperSonicFly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("超音速飞行");
    }
}
