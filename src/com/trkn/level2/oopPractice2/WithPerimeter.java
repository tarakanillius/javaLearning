package com.trkn.level2.oopPractice2;

public interface WithPerimeter {
    double getPerimeter();

    default double getSide(Point point1, Point point2) {
        return point1.distance(point2);
    }
    default double getSemiPerimeter() {
        return getPerimeter() / 2;
    }
}
