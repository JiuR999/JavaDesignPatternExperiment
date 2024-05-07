package org.example.lab1.question7.builder;

import org.example.lab1.question7.cloth.Cloth;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class ClothDetails {
    List<Cloth> cloths;

    public ClothDetails() {
        cloths = new ArrayList<>();
    }
    public void addCloth(Cloth cloth){
        this.cloths.add(cloth);
    }

    public int getTotalPrice(){
        int sum = 0;
        for (Cloth cloth : cloths) {
            sum += cloth.price();
        }
        return sum;
    }

    public void show(){
        System.out.printf("%-12s%-8s %n","服饰名称","价格/元");
        for (Cloth cloth : cloths) {
            System.out.printf("%-12s%-8s%n",cloth.name(),cloth.price());
        }
    }
}
