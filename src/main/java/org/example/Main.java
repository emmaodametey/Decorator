package org.example;

import org.example.component.Rectangle;
import org.example.component.Shape;
import org.example.decorator.CircleDecorator;
import org.example.decorator.SquareDecorator;

public class Main {
    public static void main(String[] args){
//        Shape rectangle = new Rectangle();
//        rectangle = new CircleDecorator(rectangle);
//        rectangle.draw();

        Shape compoundShape = new CircleDecorator(new Rectangle());
        compoundShape.draw();
        compoundShape = new SquareDecorator(compoundShape);
        compoundShape.draw();
    }

}