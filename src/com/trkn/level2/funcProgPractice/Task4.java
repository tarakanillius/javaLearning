package com.trkn.level2.funcProgPractice;

//4. Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
//Пример: список {5, 2, 4, 2, 1}
//Результирующая строка: "52421"

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,0);

        String collect = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        System.out.println(collect);
    }
}
