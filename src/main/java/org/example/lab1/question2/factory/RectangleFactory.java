package org.example.lab1.question2.factory;

import org.example.lab1.question2.Rectangle;
import org.example.lab1.question2.RectangleEraseStratery;
import org.example.lab1.question2.Shape;
import org.example.lab1.question2.impl.ShapeFactory;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape create() {
        return new Rectangle(new RectangleEraseStratery());
    }
}
