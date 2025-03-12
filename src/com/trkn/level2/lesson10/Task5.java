package com.trkn.level2.lesson10;

import java.util.Arrays;

// Написать функцию, разбивающую строку на рваные части по n символов и сохраняющую отдельные части в массив. Вывести этот массив
public class Task5 {
    public static void main(String[] args) {
        String string = "Aye123Aye123";
        System.out.println(Arrays.toString(breakString(string,3)));
    }

    public static String[] breakString(String string, int n){
        String[] array = new String[string.length() / n + (string.length() % n == 0 ? 0 : 1)];
        int index = 0;
        for (int i = 0; i < string.length();i+=n) {
            array[index++] = string.substring(i, Math.min(i + n, string.length()));
        }
        return array;
    }
}
