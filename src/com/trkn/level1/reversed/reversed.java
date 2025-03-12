package com.trkn.level1.reversed;

public class reversed {
    public static void main(String[] args) {
        int number = 1234;
        int reversed = reverse(number);
        System.out.println(reversed);
    }

    private static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
