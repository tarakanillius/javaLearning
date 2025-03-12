package com.trkn.level1.deleteRepeatingNumbers;

import java.util.Random;

public class deleteRepeatingNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,10);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
