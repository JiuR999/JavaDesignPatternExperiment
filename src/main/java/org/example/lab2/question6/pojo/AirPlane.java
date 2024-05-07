package org.example.lab2.question6.pojo;

import org.example.lab2.question6.stratery.FlyStrategy;
import org.example.lab2.question6.stratery.TakeOffStrategy;

public class AirPlane extends Aircraft {

    public AirPlane(TakeOffStrategy takeOffStrategy, FlyStrategy flyingStrategy) {
        super(takeOffStrategy, flyingStrategy);
    }
}
