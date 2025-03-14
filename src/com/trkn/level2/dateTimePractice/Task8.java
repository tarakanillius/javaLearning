package com.trkn.level2.dateTimePractice;

import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

//Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла дату на ближайшее (в днях) 1 января.

public class Task8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime adjusted = now.with(new NearestNewYearAdjuster());

        System.out.println(adjusted);
    }

    static class NearestNewYearAdjuster implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            LocalDateTime dateTime = LocalDateTime.from(temporal);
            LocalDateTime currentYearStart = dateTime.with(TemporalAdjusters.firstDayOfYear());
            LocalDateTime nextYearStart = dateTime.with(TemporalAdjusters.firstDayOfNextYear());

            long daysToCurrentYear = ChronoUnit.DAYS.between(dateTime, currentYearStart);
            long daysToNextYear = ChronoUnit.DAYS.between(dateTime, nextYearStart);

            return Math.abs(daysToCurrentYear) <= Math.abs(daysToNextYear) ? currentYearStart : nextYearStart;
        }
    }
}