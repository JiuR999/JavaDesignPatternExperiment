package cn.swust.lab2.question6.factory;

import cn.swust.lab2.question6.stratery.SubSonicFly;
import cn.swust.lab2.question6.stratery.VerticalTakeOff;
import cn.swust.lab2.question6.pojo.Aircraft;
import cn.swust.lab2.question6.pojo.Helicopter;

public class HelicopterFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft() {
        return new Helicopter(new VerticalTakeOff(), new SubSonicFly());
    }
}