package org.example.lab1.question2;

public class Rectangle extends Shape{
    public Rectangle(EraseStatery statery) {
        super(statery);
    }

    @Override
    public void draw() {
        System.out.println("画矩形");
    }

    @Override
    public void display() {
        System.out.println("这是矩形");
    }
}
