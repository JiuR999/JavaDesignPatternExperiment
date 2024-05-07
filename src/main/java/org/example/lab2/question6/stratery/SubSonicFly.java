package org.example.lab2.question6.stratery;

import org.example.lab2.question6.stratery.FlyStrategy;

public class SubSonicFly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("亚音速飞行");
    }
}
