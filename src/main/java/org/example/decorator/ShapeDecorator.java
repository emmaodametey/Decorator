package org.example.decorator;

import org.example.component.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw(){
        decoratedShape.draw();
        drawShape();
    }
    protected abstract void drawShape();
}
