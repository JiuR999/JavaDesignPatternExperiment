package cn.swust.lab1.question6.one;

public class Client {
    public static void main(String[] args) {
        int num = 0;
        People agency = new Agency("中介1");
        People rent1 = new People("租客1");
        People rent2 = new People("租客2");
        People rent3 = new People("租客3");
        House house1 = new House(233.3,"西南科技大学东4A");
        House house2 = new House(233.3,"西南科技大学东5A");
        House house3 = new House(233.3,"西南科技大学东6A");

        Rent proxy = (Rent) ProxyFactory.getProxy(agency, new MyInterCepter(agency));

        proxy.rentHouse(rent1,house1);
        proxy.rentHouse(rent3,house2);
    }
}
