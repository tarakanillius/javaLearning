package com.trkn.level2.collectionFinalPractice.second;

import java.util.Objects;

public class SuperCar extends Car{
    private final double timeTo100;

    public SuperCar(String brand, String model, int yearRelease, int maxSpeed, int price, double timeTo100) {
        super(brand, model, yearRelease, maxSpeed, price);
        this.timeTo100 = timeTo100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SuperCar superCar = (SuperCar) o;
        return Double.compare(superCar.timeTo100, timeTo100) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(timeTo100);
    }
}
