package cn.swust.lab1.question9;

import cn.swust.lab1.question9.room.BashRoom;
import cn.swust.lab1.question9.room.KitchRoom;
import cn.swust.lab1.question9.room.WCRoom;

public class ApartmentBuilder extends HouseBuilder {
    @Override
    void setType() {
        this.house.setType("公寓");
    }
    @Override
    void buildWC() {
        addRoom(new WCRoom(), 2);
    }
    @Override
    void buildBathroom() {
        addRoom(new BashRoom(), 2);
    }
    @Override
    void buildKitch() {
        addRoom(new KitchRoom(), 1);
    }
}
