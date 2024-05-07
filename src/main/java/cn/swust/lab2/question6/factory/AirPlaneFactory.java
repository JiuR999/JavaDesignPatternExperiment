package cn.swust.lab2.question6.factory;

import cn.swust.lab2.question6.stratery.LongDistanceTakeOff;
import cn.swust.lab2.question6.stratery.SubSonicFly;
import cn.swust.lab2.question6.pojo.AirPlane;
import cn.swust.lab2.question6.pojo.Aircraft;

public class AirPlaneFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft() {
        return new AirPlane(new LongDistanceTakeOff(), new SubSonicFly());
    }
}