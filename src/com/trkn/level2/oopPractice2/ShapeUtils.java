package com.trkn.level2.oopPractice2;

public class ShapeUtils {
    private ShapeUtils() {
    }

    public static boolean isRectangle(Shape shape) {
        return shape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }

    public static boolean isCircle(Shape shape) {
        return shape instanceof Circle;
    }

    public static boolean isSquare(Shape shape) {
        return shape instanceof Square;
    }
}
