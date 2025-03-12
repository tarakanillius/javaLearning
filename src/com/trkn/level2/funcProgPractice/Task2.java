package com.trkn.level2.funcProgPractice;

//2. Дан список строк. Найти количество уникальных строк длиной более 8 символов.

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = List.of("123456789","123456789","987654321");
        int size = list.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(size);


        long count = list.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();
        System.out.println(count);

    }
}
