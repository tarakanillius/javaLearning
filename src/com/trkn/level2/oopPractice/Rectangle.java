package com.trkn.level2.oopPractice;

public class Rectangle {
    Point topLeft;
    Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        return Math.abs(topLeft.x() - bottomRight.x()) * Math.abs(topLeft.y() - bottomRight.y());
    }

    public double getDiagonal() {
        return topLeft.distance(bottomRight);
    }
}
