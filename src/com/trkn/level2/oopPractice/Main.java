package com.trkn.level2.oopPractice;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Rectangle r1 = new Rectangle(p1, p2);
        System.out.println(r1.getArea());
        System.out.println(r1.getDiagonal());
    }
}
