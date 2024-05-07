package org.example.lab2.question6.factory;

import org.example.lab2.question6.pojo.Aircraft;
import org.example.lab2.question6.stratery.SuperSonicFly;
import org.example.lab2.question6.stratery.VerticalTakeOff;
import org.example.lab2.question6.pojo.Harrier;

public class HarrierFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft() {
        return new Harrier(new VerticalTakeOff(), new SuperSonicFly());
    }
}