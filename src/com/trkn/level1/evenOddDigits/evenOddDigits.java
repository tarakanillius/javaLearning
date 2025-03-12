package com.trkn.level1.evenOddDigits;

public class evenOddDigits {
    public static void main(String[] args) {
        int number = 228910;
        int[] array = Integer.toString(number).chars().map(c -> c - '0').toArray();
        System.out.println("even " + evenDigits(array)+" odd " + oddDigits(array));
    }

    private static int evenDigits(int[] array) {
        int temp = 0;
        for (Integer i : array) {
            if (i % 2 == 0) {
                temp++;
            }
        }
        return temp;
    }

    private static int oddDigits(int[] array) {
        int temp = 0;
        for (Integer i : array) {
            if (i % 2 != 0) {
                temp++;
            }
        }
        return temp;
    }
}
