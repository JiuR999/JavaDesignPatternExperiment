package org.example.lab2.question6.factory;

import org.example.lab2.question6.pojo.Aircraft;
import org.example.lab2.question6.stratery.LongDistanceTakeOff;
import org.example.lab2.question6.stratery.SuperSonicFly;
import org.example.lab2.question6.pojo.Fighter;

public class FighterFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft() {
        return new Fighter(new LongDistanceTakeOff(), new SuperSonicFly());
    }
}