package org.example.lab1.question7;

import org.example.lab1.question7.builder.ClothDetails;
import org.example.lab1.question7.cloth.*;

public class Client {
    public static void main(String[] args) {
        ClothDetails details = new ClothDetails();
        //模拟用户选了一双普通运动鞋
        Cloth shoes = new SportShoe();
        shoes.setClothLevel(new NormalLevel());
        details.addCloth(shoes);
        //模拟用户选了一双高级衬衫
        Cloth shirt = new Shirt();
        shirt.setClothLevel(new SeniorLevel());
        details.addCloth(shirt);
        //模拟用户选了一双高级牛仔裤
        Cloth jeans = new Jeans();
        jeans.setClothLevel(new SeniorLevel());
        details.addCloth(jeans);
        //模拟用户选了一双普通短袜
        Cloth sock = new ShortSocks();
        sock.setClothLevel(new NormalLevel());
        details.addCloth(sock);

        details.show();
        System.out.println("总价:" + details.getTotalPrice());
    }
}
