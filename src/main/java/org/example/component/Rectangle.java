package org.example.component;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
