package org.example.lab1.question7;

public class SeniorLevel implements ClothLevel{
    @Override
    public String type() {
        return "高级";
    }

    @Override
    public int price() {
        return 4;
    }
}
