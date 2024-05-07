package cn.swust.lab1.question9;

import cn.swust.lab1.question9.room.Room;

public abstract class HouseBuilder {
    protected House house;
    public HouseBuilder() {
        house = new House();
    }
    abstract void setType();
    abstract void buildWC();
    abstract void buildBathroom();
    abstract void buildKitch();
    void addRoom(Room room, int num){
        assert num != 0;
        for (int i = 0; i < num; i++) {
            house.rooms.add(room);
        }
    }

    public House getHouse() {
        return house;
    }
}
