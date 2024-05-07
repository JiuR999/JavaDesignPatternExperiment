package cn.swust.lab2.question6;

import cn.swust.lab2.question6.factory.*;
import cn.swust.lab2.question6.pojo.Aircraft;


public class Client {
    public static void main(String[] args) {
        // 创建直升机
        AircraftFactory helicopterFactory = new HelicopterFactory();
        Aircraft helicopter = helicopterFactory.createAircraft();

        // 创建客机
        AircraftFactory airPlaneFactory = new AirPlaneFactory();
        Aircraft airPlane = airPlaneFactory.createAircraft();

        // 创建歼击机
        AircraftFactory fighterFactory = new FighterFactory();
        Aircraft fighter = fighterFactory.createAircraft();

        // 创建鹞式战斗机
        AircraftFactory harrierFactory = new HarrierFactory();
        Aircraft harrier = harrierFactory.createAircraft();

        // 调用各种飞机的起飞和飞行方法
        System.out.println("Helicopter:");
        helicopter.performTakeOff();
        helicopter.performFly();

        System.out.println("\nAirPlane:");
        airPlane.performTakeOff();
        airPlane.performFly();

        System.out.println("\nFighter:");
        fighter.performTakeOff();
        fighter.performFly();

        System.out.println("\nHarrier:");
        harrier.performTakeOff();
        harrier.performFly();
    }
}
