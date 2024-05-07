package cn.swust.lab1.question2.factory;

import cn.swust.lab1.question2.Shape;
import cn.swust.lab1.question2.TriangleEraseStratery;
import cn.swust.lab1.question2.impl.ShapeFactory;
import cn.swust.lab1.question2.Triangle;

public class TriangleFactory extends ShapeFactory {
    @Override
    public Shape create() {

        return new Triangle(new TriangleEraseStratery());
    }
}
