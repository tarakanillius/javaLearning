package com.trkn.level2.oopPractice2;

public class Rectangle extends Shape implements WithDiagonal, WithPerimeter {
    private final Point point1;
    private final Point point2;

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    @Override
    public double getArea() {
        return Math.abs(point1.x() - point2.x()) * Math.abs(point1.y() - point2.y());
    }

    @Override
    public double getDiagonal() {
        return getSide(point1,point2);
    }

    @Override
    public double getPerimeter() {
        return 2 * (Math.abs(point1.x() - point2.x()) + Math.abs(point1.y() - point2.y()));
    }
}
