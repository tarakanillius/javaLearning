package com.trkn.level1.linearize;

import java.util.Arrays;

public class linearize {
    public static void main(String[] args) {
        int[][] array = {{9, 8, 7, 6}, {5, 4, 3, 2, 1}};
        Arrays.stream(linearizee(array)).forEach(i -> System.out.print(i + " "));
    }

    private static int[] linearizee(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
