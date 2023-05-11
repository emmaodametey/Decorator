package org.example.decorator;

import org.example.component.Shape;

public class CircleDecorator extends ShapeDecorator {
    public CircleDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    protected void drawShape() {
        System.out.println("Drawing a circle around a " + decoratedShape.toString());
    }
}
