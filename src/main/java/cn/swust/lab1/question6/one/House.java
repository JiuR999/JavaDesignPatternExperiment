package cn.swust.lab1.question6.one;

public class House {
    long id;
    double price;
    String location;

    People renter;
    public House(double price, String location) {
        this.id = Math.round(Math.random()*1000);
        this.price = price;
        this.location = location;
    }
    public void rentOut(People people){
        this.renter = people;
        System.out.println("房ID为" + id +"的房子被" + people.getName() + "租走");
        System.out.println(renter.getName() + "拿了租房钥匙");
    }
}
