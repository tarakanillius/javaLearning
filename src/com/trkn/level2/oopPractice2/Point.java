package com.trkn.level2.oopPractice2;

public record Point(int x, int y) {

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.x() - x, 2) + Math.pow(point.y() - y, 2));
    }
}
