package com.trkn.level2.collectionFinalPractice.second;

import java.util.Objects;

public abstract class Car {
    private final String brand;
    private final String model;
    private final int yearRelease;
    private final int maxSpeed;
    private final int price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return yearRelease == car.yearRelease && maxSpeed == car.maxSpeed && price == car.price
                && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearRelease, maxSpeed, price);
    }

    public Car(String brand, String model, int yearRelease, int maxSpeed, int price) {
        this.brand = brand;
        this.model = model;
        this.yearRelease = yearRelease;
        this.maxSpeed = maxSpeed;
        this.price = price;


    }
}
