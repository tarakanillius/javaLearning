package com.trkn.level2.oopPractice2;

public class Triangle extends Shape implements WithPerimeter{
    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }

    @Override
    public double getPerimeter() {
        return getSide(point1, point2) + getSide(point2, point3) + getSide(point3, point1);

    }

    @Override
    public double getArea() {
        return Math.sqrt(getSemiPerimeter() * (getSemiPerimeter() - getSide(point1,point2)) * (getSemiPerimeter() - getSide(point2,point3)) * (getSemiPerimeter() - getSide(point3,point1)));
    }
}
