package org.example.lab1.question9;

import org.example.lab1.question9.room.Room;

import java.util.ArrayList;
import java.util.List;

public  class House {
    protected List<Room> rooms;
    protected String type;
    public House() {
        rooms = new ArrayList<>();
    }

    public int countRent(){
        int sum = 0;
        for (Room room : rooms) {
            sum += room.getPrice();
        }
        return sum;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
