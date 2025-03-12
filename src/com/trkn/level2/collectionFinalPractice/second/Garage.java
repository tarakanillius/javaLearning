package com.trkn.level2.collectionFinalPractice.second;

import java.util.HashMap;

public class Garage {
    private final HashMap<Car,Integer> cars;

    public Garage() {
        this.cars = new HashMap<>();
    }

    public void parkCar(Car car) {
        if (cars.containsKey(car)) {
            cars.put(car, cars.get(car) + 1);
        } else {
            cars.put(car, 1);
        }
    }

    public void leaveCar(Car car) {
        if (cars.containsKey(car)) {
            if (cars.get(car) == 1) {
                cars.remove(car);
            } else {
                cars.put(car, cars.get(car) - 1);
            }
        }
    }

    public void getCount(Car car) {
        System.out.println(car.toString()+" - "+cars.getOrDefault(car, 0));
    }

    public void getTotalCount() {
        int totalCount = 0;
        for (int count : cars.values()) {
            totalCount += count;
        }
        System.out.println("Total car: "+totalCount);
    }
}
