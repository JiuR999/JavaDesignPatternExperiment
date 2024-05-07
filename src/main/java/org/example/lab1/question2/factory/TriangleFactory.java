package org.example.lab1.question2.factory;

import org.example.lab1.question2.Shape;
import org.example.lab1.question2.TriangleEraseStratery;
import org.example.lab1.question2.impl.ShapeFactory;
import org.example.lab1.question2.Triangle;

public class TriangleFactory extends ShapeFactory {
    @Override
    public Shape create() {

        return new Triangle(new TriangleEraseStratery());
    }
}
