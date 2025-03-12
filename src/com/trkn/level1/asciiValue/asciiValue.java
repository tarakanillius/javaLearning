package com.trkn.level1.asciiValue;

public class asciiValue {
    public static void main(String[] args) {
        char[] array = {'a','6','y','P','T','q','9','+'};
        for (int i:array){
            System.out.print(i+" ");
        }
    }

    private static int[] translate (char[] array){
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (int) array[i];
        }
        return result;
    }
}
