package org.example.lab1.question7.cloth;

public class Shirt extends Tops{
    @Override
    public String name() {
        return clothLevel.type() + "衬衫";
    }

    @Override
    public int price() {
        return 26 * clothLevel.price();
    }

    @Override
    public void size() {
        System.out.println("选择衬衫大小");
    }
}
