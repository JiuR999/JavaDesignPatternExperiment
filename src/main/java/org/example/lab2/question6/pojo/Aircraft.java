package org.example.lab2.question6.pojo;

import org.example.lab2.question6.stratery.FlyStrategy;
import org.example.lab2.question6.stratery.TakeOffStrategy;

public class Aircraft {
    protected FlyStrategy flyingStrategy;
    protected TakeOffStrategy takeOffStrategy;

    public Aircraft(TakeOffStrategy takeOffStrategy, FlyStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
        this.takeOffStrategy = takeOffStrategy;
    }

    public void performFly(){
        flyingStrategy.fly();
    }

    public void performTakeOff(){
        takeOffStrategy.takeOff();
    }
}
