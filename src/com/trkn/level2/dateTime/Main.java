package com.trkn.level2.dateTime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println(now.toInstant().toEpochMilli());
        System.out.println(now.plusDays(365));
        System.out.println(now.truncatedTo(ChronoUnit.DAYS));
        System.out.println(now.getDayOfWeek());
        System.out.println(now.isBefore(now.plusDays(365)));
        LocalDateTime localDateTime = LocalDateTime.of(2000, 10, 2, 2, 2, 2);
        System.out.println(localDateTime);
    }
}
