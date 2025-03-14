package com.trkn.level2.dateTimePractice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

//1. Создать объект LocalDateTime, представляющий собой дату 25.06.2020 19:47.Используя этот объект, создать другой объект LocalDateTime,
//представляющий собой дату через 3 месяца после сегодняшней. Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
public class Task1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2000, 6, 25, 19, 47);
        LocalDateTime localDateTime1 = LocalDateTime.now().plusMonths(3).truncatedTo(ChronoUnit.MINUTES);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime1.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
        System.out.println(localDateTime1.toLocalTime());
    }
}
