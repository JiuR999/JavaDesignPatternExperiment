package org.example.lab1.question7.cloth;

public class Jeans extends Pants{
    @Override
    public String name() {
        return clothLevel.type() + "牛仔裤";
    }

    @Override
    public int price() {
        return 50 * clothLevel.price();
    }

    @Override
    public void size() {
        System.out.println("请选择" + name() + "大小");
    }
}
