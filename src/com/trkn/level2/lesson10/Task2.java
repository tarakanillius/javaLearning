package com.trkn.level2.lesson10;

// Написать функцию, которая принимает два параметра (строку и слово) и возвращает true, если строка начинается и заканчивается этим словом.
public class Task2 {
    public static void main(String[] args) {
        String string = "Ayejkdljsaldakjsdaye";
        String word = "aye";
        System.out.println(check(string, word));

    }

    public static boolean check(String string, String word) {
        System.out.println(word.toLowerCase() + " " + string.toLowerCase());
        return string.toLowerCase().startsWith(word.toLowerCase()) && string.toLowerCase().endsWith(word.toLowerCase());
    }
}
