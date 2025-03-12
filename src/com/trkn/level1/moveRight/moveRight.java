package com.trkn.level1.moveRight;

public class moveRight {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i]+" ");
        }
        for (;;){
            System.out.println();
            int lastElement = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastElement;
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }
}
