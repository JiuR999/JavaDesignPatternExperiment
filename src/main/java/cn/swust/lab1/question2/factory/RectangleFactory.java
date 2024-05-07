package cn.swust.lab1.question2.factory;

import cn.swust.lab1.question2.Rectangle;
import cn.swust.lab1.question2.RectangleEraseStratery;
import cn.swust.lab1.question2.Shape;
import cn.swust.lab1.question2.impl.ShapeFactory;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape create() {
        return new Rectangle(new RectangleEraseStratery());
    }
}
