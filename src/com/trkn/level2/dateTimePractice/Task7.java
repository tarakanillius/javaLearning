package com.trkn.level2.dateTimePractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//7. Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня
public class Task7 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate with = today.with(temporal -> temporal.plus(42, ChronoUnit.DAYS));
        System.out.println(with);
    }
}
