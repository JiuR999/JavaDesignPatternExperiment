package cn.swust.lab1.question6.two;

import cn.swust.lab1.question6.two.pojo.Landlord;
import cn.swust.lab1.question6.two.pojo.RentalAgency;
import cn.swust.lab1.question6.two.pojo.Tenant;

public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord("房东张");
        Tenant tenant = new Tenant("租客李");
        RentalAgency rentalAgency = new RentalAgency();
        // 注册观察者
        rentalAgency.registerObserver(landlord);
        rentalAgency.registerObserver(tenant);
        // 进行租房交易
        rentalAgency.rentHouse("西南科技大学东6");
        // 统计已办理的交易数
        System.out.println("已办理的交易数：" + rentalAgency.getTransactionCount());
    }
}
