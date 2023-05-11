package org.example.component;

public class Diamond implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a diamond");
    }

    @Override
    public String toString() {
        return "Diamond";
    }
}
