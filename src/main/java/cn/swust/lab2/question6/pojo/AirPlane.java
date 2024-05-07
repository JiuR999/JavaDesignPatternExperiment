package cn.swust.lab2.question6.pojo;

import cn.swust.lab2.question6.stratery.FlyStrategy;
import cn.swust.lab2.question6.stratery.TakeOffStrategy;

public class AirPlane extends Aircraft {

    public AirPlane(TakeOffStrategy takeOffStrategy, FlyStrategy flyingStrategy) {
        super(takeOffStrategy, flyingStrategy);
    }
}
