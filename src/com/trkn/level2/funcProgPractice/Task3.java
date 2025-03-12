package com.trkn.level2.funcProgPractice;

//3. Дана Map<String, Integer>. Найти сумму всех
//значений, длина ключей которых меньше 7 символов.

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(Map.of(
                "a", 12345678,
                "b", 2,
                "c", 323434234,
                "d", 3,
                "e", 5
        ));

        int sum = map.values().stream()
                .filter(i -> i.toString().length() < 7)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
