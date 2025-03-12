package com.trkn.level2.oopPractice2;

public class Circle extends Shape implements WithRadius {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

}
