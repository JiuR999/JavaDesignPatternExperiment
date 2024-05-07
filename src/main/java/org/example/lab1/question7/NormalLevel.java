package org.example.lab1.question7;

public class NormalLevel implements ClothLevel{
    @Override
    public String type() {
        return "普通";
    }

    @Override
    public int price() {
        return 2;
    }
}
