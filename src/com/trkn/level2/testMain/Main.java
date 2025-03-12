package com.trkn.level2.testMain;

public class Main{
    public static void main(String[] args) {
        Com com = new Com("Oleksandr", 30);
        Com com2 = new Com("Adsadsd", 10);

        print(com, com2, () -> System.out.println("Ламбда экспресия"));
    }

    public static void print(Printable... objects){
        for (Printable object : objects) {
            object.print();
        }
    }

}

