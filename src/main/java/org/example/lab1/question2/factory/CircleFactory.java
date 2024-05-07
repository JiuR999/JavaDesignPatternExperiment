package org.example.lab1.question2.factory;

import org.example.lab1.question2.Circle;
import org.example.lab1.question2.CircleEraseStratery;
import org.example.lab1.question2.Shape;
import org.example.lab1.question2.impl.ShapeFactory;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape create() {
        return new Circle(new CircleEraseStratery());
    }
}
