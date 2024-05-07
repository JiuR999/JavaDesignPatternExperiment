package org.example.lab1.question9;

public class HouseBuilderDirector {
    HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.setType();
        houseBuilder.buildWC();
        houseBuilder.buildBathroom();
        houseBuilder.buildKitch();

    }
}
