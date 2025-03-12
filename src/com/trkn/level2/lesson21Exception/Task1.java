package com.trkn.level2.lesson21Exception;

//1. Объявите переменную со значением null. Вызовите метод у этой
//переменной. Отловите возникшее исключение.

public class Task1 {
    public static void main(String[] args) {
        String str = null;
        try {
            str.length();
        } catch (NullPointerException e) {
            System.err.println(" !");
            e.printStackTrace();
        }
    }
}
