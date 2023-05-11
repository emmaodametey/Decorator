package org.example.decorator;

import org.example.component.Shape;

public class SquareDecorator extends ShapeDecorator {
    public SquareDecorator(Shape shape){
        super(shape);
    }

    @Override
    protected void drawShape() {
        System.out.println("drawing a square around a " + decoratedShape.toString());
    }
}
