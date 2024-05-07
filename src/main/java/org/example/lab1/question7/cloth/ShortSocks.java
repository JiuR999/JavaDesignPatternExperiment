package org.example.lab1.question7.cloth;

public class ShortSocks extends Socks{
    @Override
    public String name() {
        return clothLevel.type() + "短袜";
    }

    @Override
    public int price() {
        return 3 * clothLevel.price();
    }

    @Override
    public void size() {
        System.out.println("选择短袜大小");
    }
}
