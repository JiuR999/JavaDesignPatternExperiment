package cn.swust.lab1.question9;

import cn.swust.lab1.question9.room.BashRoom;
import cn.swust.lab1.question9.room.KitchRoom;
import cn.swust.lab1.question9.room.WCRoom;

public class DormitoryBuilder extends HouseBuilder{
    @Override
    void setType() {
        this.house.setType("宿舍");
    }
    @Override
    void buildWC() {
        addRoom(new WCRoom(),1);
    }
    @Override
    void buildBathroom() {
        addRoom(new BashRoom(),1);
    }
    @Override
    void buildKitch() {
        addRoom(new KitchRoom(),0);
    }
}
