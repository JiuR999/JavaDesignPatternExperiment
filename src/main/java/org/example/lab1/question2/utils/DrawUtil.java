package org.example.lab1.question2.utils;

import org.example.lab1.question2.Shape;
import org.example.lab1.question2.factory.CircleFactory;
import org.example.lab1.question2.factory.RectangleFactory;
import org.example.lab1.question2.factory.TriangleFactory;
import org.example.lab1.question2.impl.ShapeFactory;

import java.util.Spliterator;

public class DrawUtil {

    public static final String CIRCLE = "circle";
    public static final String TRIANGLE = "triangle";
    public static final String RECTANGLE = "rectangle";
    ShapeFactory shapeFactory;
    Shape shape;
    public void draw(String type) throws UnsupportedShapeException {
            if(type.equals(CIRCLE)){
                this.shapeFactory = new CircleFactory();
            } else if(type.equals(TRIANGLE)){
                this.shapeFactory = new TriangleFactory();
            } else if(type.equals(RECTANGLE)) {
                this.shapeFactory = new RectangleFactory();
            } else {
                throw new UnsupportedShapeException("不支持该图像");
            }
            this.shape = shapeFactory.create();
            this.shape.draw();
    }

    public void erase(){
        this.shape.erase();
    }
    public class UnsupportedShapeException extends Exception{
        public UnsupportedShapeException(String message){
            super(message);
        }
    }
}
