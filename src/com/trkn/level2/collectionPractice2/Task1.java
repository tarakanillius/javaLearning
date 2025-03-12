package com.trkn.level2.collectionPractice2;

//1. Написать метод, который принимает целочисленный список и возвращает
//целочисленный список только с нечетными значениями.

import java.util.ArrayList;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(removeEven(list));
    }

    public static List<Integer> removeEven(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (Integer next : list) {
            if (next % 2 != 0) {
                temp.add(next);
            }
        }
        return temp;
    }
}
