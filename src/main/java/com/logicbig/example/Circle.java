package com.logicbig.example;

public class Circle extends Shape {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static Circle of(int radius) {
        Circle c = new Circle();
        c.setRadius(radius);
        return c;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}