package com.trkn.level2.oopPractice2;

public abstract class Shape {
    public boolean equalsArea(Shape shape) {
        return this.getArea() == shape.getArea();
    }

    public abstract double getArea();
}
