package cn.swust.lab2.question6.factory;

import cn.swust.lab2.question6.stratery.SuperSonicFly;
import cn.swust.lab2.question6.stratery.VerticalTakeOff;
import cn.swust.lab2.question6.pojo.Aircraft;
import cn.swust.lab2.question6.pojo.Harrier;

public class HarrierFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft() {
        return new Harrier(new VerticalTakeOff(), new SuperSonicFly());
    }
}