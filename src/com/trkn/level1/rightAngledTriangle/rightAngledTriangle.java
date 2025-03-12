package com.trkn.level1.rightAngledTriangle;

import java.util.Scanner;

public class rightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 T a: ");
        double t1a = scanner.nextDouble();
        System.out.print("1 T b: ");
        double t1b = scanner.nextDouble();
        System.out.print("2 T a: ");
        double t2a = scanner.nextDouble();
        System.out.print("2 T b: ");
        double t2b = scanner.nextDouble();
        major(calcArea(t1a, t1b),calcArea(t2a, t2b));
    }

    private static double calcArea (double a, double b){
        return a*b/2;
    }

    private static void major (double a, double b){
        if ( a > b) {
            System.out.println("1 T is major " + a);
        } else if (a < b) {
            System.out.println("2 T is major " + b);
        } else {
            System.out.println("equal " + a);
        }
    }
}
