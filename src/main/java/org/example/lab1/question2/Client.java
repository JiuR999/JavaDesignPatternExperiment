package org.example.lab1.question2;

import org.example.Main;
import org.example.lab1.question2.factory.CircleFactory;
import org.example.lab1.question2.impl.ShapeFactory;
import org.example.lab1.question2.utils.DrawUtil;

public class Client {
    ShapeFactory shapeFactory;

    public Client(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public static void main(String[] args) throws DrawUtil.UnsupportedShapeException {
        DrawUtil drawUtil = new DrawUtil();
        //画一个圆
        drawUtil.draw(DrawUtil.CIRCLE);
        System.out.println("=====================");
        drawUtil.erase();
        //画一个三角形
        drawUtil.draw(DrawUtil.TRIANGLE);
        //画一个矩形
        drawUtil.draw(DrawUtil.RECTANGLE);
        //不支持
        System.out.println("=====================");
        drawUtil.draw("roral");
    }
}
