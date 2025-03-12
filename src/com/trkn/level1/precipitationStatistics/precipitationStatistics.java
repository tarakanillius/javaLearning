package com.trkn.level1.precipitationStatistics;

import java.util.Scanner;

public class precipitationStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter days: ");
        int days = scanner.nextInt();
        int sum = 0, max = 0, avg;
        for (int day = 0; day < days; day++) {
            System.out.println("Enter precipitation: ");
            int temp = scanner.nextInt();
            sum += temp;
            if (temp > max) {
                max = temp;
            }
        }
        avg = sum / days;
        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
        System.out.println("max " + max);

    }
}
