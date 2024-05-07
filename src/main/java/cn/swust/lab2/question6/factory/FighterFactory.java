package cn.swust.lab2.question6.factory;

import cn.swust.lab2.question6.stratery.SuperSonicFly;
import cn.swust.lab2.question6.pojo.Aircraft;
import cn.swust.lab2.question6.stratery.LongDistanceTakeOff;
import cn.swust.lab2.question6.pojo.Fighter;

public class FighterFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft() {
        return new Fighter(new LongDistanceTakeOff(), new SuperSonicFly());
    }
}