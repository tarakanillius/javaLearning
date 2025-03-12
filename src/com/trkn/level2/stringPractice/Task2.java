package com.trkn.level2.stringPractice;

public class Task2 {
    public static void main(String[] args) {
        String value = "MDIVX";
        System.out.println(convert(value));
    }

    public static int convert (String string) {
        int result = 0, prev = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
             int current = getNumber(string.charAt(i));
             result += current < prev ? -current : current;
             prev = current;
        }
        return result;
    }

    public static int getNumber(char character) {
        return switch (character) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
