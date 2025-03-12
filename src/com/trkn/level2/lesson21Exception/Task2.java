package com.trkn.level2.lesson21Exception;

//2. Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
public class Task2 {
    public static void main(String[] args) {
        var array = new String[1];
        try {
            System.out.println(array[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(" !");
            e.printStackTrace();
        }
    }
}
