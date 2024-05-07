package cn.swust.lab1.question2;

public class Circle extends Shape{
    public Circle(EraseStatery statery) {
        super(statery);
    }

    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
    @Override
    public void display() {
        System.out.println("这是一个圆");
    }
}
