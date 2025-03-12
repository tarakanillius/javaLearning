package com.trkn.level1.quarterHour;

import java.util.Scanner;

public class quarterHour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter minutes: ");
            int minutes = scanner.nextInt();
            if (minutes == -1) {
                break;
            }
            if (minutes >= 0 && minutes  <= 15) {
                System.out.println("1");
            }
                else if (minutes  >= 16 && minutes  <= 30) {
                System.out.println("2");
            }
                else if (minutes  >= 31 && minutes  <= 45) {
                System.out.println("3");
            }
                else if (minutes  >= 46 && minutes  <= 60) {
                System.out.println("4");
            }
                else{
                System.out.println("Invalid input");
            }
        }
    }
}
