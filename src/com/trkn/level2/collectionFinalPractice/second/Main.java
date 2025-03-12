package com.trkn.level2.collectionFinalPractice.second;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        SuperCar sc = new SuperCar("Brand","Model",2000,100,4000,20);
        SuperCar sc2 = new SuperCar("Brandd","Modell",2015,200,40000,10);
        FamilyCar fc = new FamilyCar("Brandd","Modell",200,100,400,4,true);
        garage.parkCar(sc);
        garage.parkCar(sc);
        garage.getCount(sc);
        garage.getTotalCount();
        garage.parkCar(sc2);
        garage.parkCar(fc);
        garage.getCount(sc2);
        garage.getTotalCount();
        garage.leaveCar(sc);
        garage.getCount(sc);
        garage.getTotalCount();
    }
}
