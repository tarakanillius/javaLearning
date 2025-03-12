package com.trkn.level2.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "66","55","88");
        IntSummaryStatistics count = strings.stream()
                .map(value -> value + value)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(3)
                .mapToInt(Integer::intValue)
//                .mapToObj(Integer::valueOf)
                .summaryStatistics();
        System.out.println(count);

        List<String> collect = java.util.stream.Stream.of("12", "13")
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(collect);


        IntStream.range(0,10)
                .forEach(System.out::print);

        IntStream.iterate(0, i -> i + 1)
                .limit(10)
                .forEach(System.out::print);
//        for (String string : strings) {
//            String value = string+string;
//            Integer integer = Integer.valueOf(value);
//            if (integer % 2 == 0) {
//                System.out.println(integer);
//            }
//        }
    }
}
