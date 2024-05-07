package cn.swust.lab1.question6.one;

public class Agency extends People implements Rent{

    public Agency(String name) {
        super(name);
    }
    @Override
    public void rentHouse(People renter, House house) {
        //交押金
        System.out.println(renter.getName() + "交了租房押金" + house.price);
        //签合同
        System.out.println(renter.getName() + "签了租房合同");
        //拿钥匙
        house.rentOut(renter);
    }

}
