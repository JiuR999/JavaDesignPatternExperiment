package cn.swust.lab1.question2.factory;

import cn.swust.lab1.question2.Circle;
import cn.swust.lab1.question2.CircleEraseStratery;
import cn.swust.lab1.question2.Shape;
import cn.swust.lab1.question2.impl.ShapeFactory;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape create() {
        return new Circle(new CircleEraseStratery());
    }
}
