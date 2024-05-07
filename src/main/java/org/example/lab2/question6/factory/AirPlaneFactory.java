package org.example.lab2.question6.factory;

import org.example.lab2.question6.pojo.AirPlane;
import org.example.lab2.question6.pojo.Aircraft;
import org.example.lab2.question6.stratery.LongDistanceTakeOff;
import org.example.lab2.question6.stratery.SubSonicFly;

public class AirPlaneFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft() {
        return new AirPlane(new LongDistanceTakeOff(), new SubSonicFly());
    }
}