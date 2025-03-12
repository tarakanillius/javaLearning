package com.trkn.level1.sortArray;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};
        Arrays.stream(sort(array))
                .forEach(row -> System.out.println(Arrays.toString(row)));
    }

    static int[][] sort(int[] array) {
        return new int[][] {
                Arrays.stream(array).filter(n -> n < 0).toArray(),
                Arrays.stream(array).filter(n -> n == 0).toArray(),
                Arrays.stream(array).filter(n -> n > 0).toArray()
        };
    }
}
