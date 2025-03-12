package com.trkn.level1.nextDay;

public class nextDay {
    public static void main(String[] args) {
        System.out.println(nextday(28, 1, 2100));
    }

    private static String nextday(int day, int month, int year) {
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day == 29) {
                        day = 1;
                        month++;
                    }
                    else {
                        day++;
                    }
                } else {
                    if (day == 28) {
                        day = 1;
                        month++;
                    }
                    else {
                        day++;
                    }
                }
                break;
            case 4, 6, 9, 11:
                if (day == 30) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                } else {
                    day++;
                }
                break;
            default:
                if(day==31){
                    day=1;
                    month++;
                }
                else{
                    day++;
                }
        }
        return day + "." + month + "." + year;
    }
}