package com.trkn.level1.thirdArray;

public class thirdArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{5, 6, 7};
        int[] array3 = new int[array1.length+array2.length];

        int index = 0;

        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[index++] = array1[i];
            }
            if (i < array2.length) {
                array3[index++] = array2[i];
            }
        }

        for (int i : array3) {
            System.out.print(i + " ");
        }
    }
}
