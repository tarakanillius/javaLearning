package com.trkn.level2.stringExercise;

public class Task2 {
    public static void main(String[] args) {
        String string = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println(getSum(getInt(string)));
    }

    public static int[] getInt(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                builder.append(string.charAt(i));
            }
        }
        int[] numbers = new int[builder.length()];
        for (int i = 0; i < builder.length(); i++) {
            numbers[i] = builder.charAt(i) - '0';
        }
        return numbers;
    }

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
