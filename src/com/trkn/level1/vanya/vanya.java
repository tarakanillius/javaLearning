package com.trkn.level1.vanya;

public class vanya {
    public static void main(String[] args) {
        double money = 0;
        double brokerAccount = 0;
        int salary = 600;
        int upgrade = 400;
        int expenses = 300;
        double investingInPercent = 0.1;
        double investmentIncome = 0.02;
        int period = 38;
        int temp = 0;
        for (int i = 1; i <= period; i++) {
            temp ++;
            
            if (temp==6){
                temp = 0;
                salary += upgrade;
            }

            double investment = salary * investingInPercent;
            brokerAccount += investment * investmentIncome;

            money += salary-expenses;

            System.out.println("На счете Вани: " + money + "$");
            System.out.println("На счете брокера: " + brokerAccount + "$");
        }

        String[] array = new String[2];
        System.out.println(array.length);
    }
}
