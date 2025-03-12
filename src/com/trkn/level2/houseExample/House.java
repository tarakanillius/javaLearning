package com.trkn.level2.houseExample;

import java.util.ArrayList;

public class House {
    private static int number;
    private final ArrayList<Floor> floorArray = new ArrayList<>();

    public House(int number) {
        number++;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Floor> getFloorArray() {
        return floorArray;
    }

    public void addFloor(Floor floorArray) {
        this.floorArray.add(floorArray);
    }

    public String toString() {
        return "House " + number+" number of floors " + floorArray.size();
    }
}
