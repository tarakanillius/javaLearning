package com.trkn.level2.oopPractice2;

public class Square extends Shape implements WithDiagonal, WithPerimeter {
    private final Point point1;
    private final Point point2;

    public Square(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public double getArea() {
        int side = Math.abs(point1.x() - point2.x());
        return side * side;
    }

    @Override
    public double getDiagonal() {
        return getSide(point1, point2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide(point1, point2);
    }
}
