package com.trkn.level1.quadraticRoots;

public class quadraticRoots {
    public static void main(String[] args) {
        run(2,-4,-6);
    }

    private static void run(int a, int b, int c) {
        double d = discriminant(a,b,c);
        if (isPositive(d)){
            System.out.println("x1 " + (-b+Math.sqrt(d))/(2*a));
            System.out.println("x2 " + (-b-Math.sqrt(d))/(2*a));
        } else if (isZero(d)){
            System.out.println("x " + (-b+Math.sqrt(d))/(2*a));
        } else {
            System.out.println("negative");
        }
    }

    private static double discriminant(int a,int b, int c){
        return Math.pow(b,2)-4*a*c;
    }

    private static boolean isPositive(double d){
        return d>0;
    }

    private static boolean isZero(double d){
        return d==0;
    }

}
