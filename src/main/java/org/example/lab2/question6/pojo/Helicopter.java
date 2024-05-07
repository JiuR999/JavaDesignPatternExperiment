package org.example.lab2.question6.pojo;

import org.example.lab2.question6.stratery.FlyStrategy;
import org.example.lab2.question6.stratery.TakeOffStrategy;

public class Helicopter extends Aircraft{
    public Helicopter(TakeOffStrategy takeOffStrategy, FlyStrategy flyingStrategy) {
        super(takeOffStrategy, flyingStrategy);
    }
}
