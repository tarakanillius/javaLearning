package com.trkn.level2.funcProgPractice;

//1. Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2,3,4,5,6,7,8,9,10,12,13,14,15);
        list.stream()
                .filter(x -> x % 2 != 0 && x % 5 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}
