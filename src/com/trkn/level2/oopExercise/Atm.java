package com.trkn.level2.oopExercise;

public class Atm {
    private int quantityTwenty;
    private int quantityFifty;
    private int quantityHundred;

    public Atm(int quantityTwenty, int quantityFifty, int quantityHundred) {
        super();
        this.quantityTwenty = quantityTwenty;
        this.quantityFifty = quantityFifty;
        this.quantityHundred = quantityHundred;
    }

    public boolean getMoney(int amount) {
        int twenty = 0, fifty = 0, hundred = 0;
        while(amount>=20){
            if (amount - 100 >= 0 && quantityHundred > 0) {
                quantityHundred--;
                hundred++;
                amount -= 100;
            } else if (amount - 50 >= 0 && quantityFifty > 0) {
                quantityFifty--;
                fifty++;
                amount -= 50;
            } else if (quantityTwenty > 0) {
                quantityTwenty--;
                twenty++;
                amount -= 20;
            } else break;
        }
        if (amount > 0) {
            System.out.println("Не удалось выдать точную сумму.");
            return false;
        }
        System.out.println("Успешно снято " + (20*twenty + 50*fifty + 100*hundred)+ " денег, номиналом 20: " + twenty + ", 50: " + fifty + ", 100: " + hundred+".");
        return true;
    }

}
