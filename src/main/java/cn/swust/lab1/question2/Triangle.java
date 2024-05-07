package cn.swust.lab1.question2;
public class Triangle extends Shape {
    public Triangle(EraseStatery statery) {
        super(statery);
    }

    @Override
    public void draw() {
        System.out.println("画三角形");
    }
    @Override
    public void display() {
        System.out.println("这是三角形");
    }
}
