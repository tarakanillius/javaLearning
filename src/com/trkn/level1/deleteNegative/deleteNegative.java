package com.trkn.level1.deleteNegative;

public class deleteNegative {
    public static void main(String[] args) {
        int[] array = delete(new int[]{3, 5, -6, 3, 2, -9, 0, -123});
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static int[] delete(int[] array) {
        int positiveCount = 0;
        for (int num : array) {
            if (num >= 0) {
                positiveCount++;
            }
        }
        int[] result = new int[positiveCount];
        int index = 0;
        for (int num : array) {
            if (num >= 0) {
                result[index++] = num*result.length;
            }
        }
        return result;
    }
}
