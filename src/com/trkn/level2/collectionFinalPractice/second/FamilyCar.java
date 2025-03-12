package com.trkn.level2.collectionFinalPractice.second;

import java.util.Objects;

public class FamilyCar extends Car{
    private final int numberOfSeats;
    private final boolean isAutomaticTransmission;

    public FamilyCar(String brand, String model, int yearRelease, int maxSpeed, int price, int numberOfSeats, boolean isAutomaticTransmission) {
        super(brand, model, yearRelease, maxSpeed, price);
        this.numberOfSeats = numberOfSeats;
        this.isAutomaticTransmission = isAutomaticTransmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyCar familyCar = (FamilyCar) o;
        return numberOfSeats == familyCar.numberOfSeats && isAutomaticTransmission == familyCar.isAutomaticTransmission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSeats, isAutomaticTransmission);
    }
}
