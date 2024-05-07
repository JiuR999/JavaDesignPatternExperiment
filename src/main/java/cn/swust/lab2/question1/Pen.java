package cn.swust.lab2.question1;

import cn.swust.lab2.question1.color.Color;

public abstract class Pen {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }
    public void write(){
        System.out.println("这是" + color.initColor() + getSize() + "笔" + "写的字");
    }
    abstract String getSize();
}
