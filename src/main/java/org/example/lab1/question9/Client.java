package org.example.lab1.question9;

public class Client {
    public static void main(String[] args) {
        //学生1选择宿舍
        switchHouse(new DormitoryBuilder());
        //学生2选择公寓
        System.out.println("=============================");
        switchHouse(new ApartmentBuilder());
    }

    private static void switchHouse(HouseBuilder builder) {
        HouseBuilderDirector director = new HouseBuilderDirector();
        director.setHouseBuilder(builder);
        director.buildHouse();
        System.out.println("您选择了" + director.getHouseBuilder().house.type);
        System.out.println("每月租金为:" + director.houseBuilder.house.countRent());
    }
}
