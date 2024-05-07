package cn.swust.lab1.question7.cloth;

public class SportShoe extends Shoes{
    @Override
    public String name() {
        return clothLevel.type() + "运动鞋";
    }

    @Override
    public int price() {
        return 56 * clothLevel.price();
    }

    @Override
    public void size() {
        System.out.println("请选择" + name() + "大小");
    }
}
