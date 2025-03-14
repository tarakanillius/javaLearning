package com.trkn.level2.dateTimePractice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//5. Даны два объекта LocalDate из предыдущего задания.
//Подсчитать количество секунд между полуночью первой даты и полуночью второй даты.
public class Task5 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2000, 6, 25, 19, 47);
        LocalDateTime localDateTime1 = LocalDateTime.now().plusMonths(3).truncatedTo(ChronoUnit.MINUTES);
        long until = localDateTime.until(localDateTime1, ChronoUnit.SECONDS);
        System.out.println(until);
//        System.out.println((((until/60)/60)/24/365));
    }
}
