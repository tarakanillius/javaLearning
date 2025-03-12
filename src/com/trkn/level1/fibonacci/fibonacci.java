package com.trkn.level1.fibonacci;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci1(10));
        System.out.println(fibonacci2(10));
    }
    //цикл
    private static int fibonacci2(int n) {
        if (n==0){return 0;}
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    //рекурсия
    private static int fibonacci1(int n) {
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return fibonacci1(n-1) + fibonacci1(n-2);
        }
    }
}
