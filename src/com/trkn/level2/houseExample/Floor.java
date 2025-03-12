package com.trkn.level2.houseExample;

import java.util.ArrayList;

public class Floor {
    private final int number;
    private final ArrayList<Apartment> apartmentArray  = new ArrayList<>();

    public Floor(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Apartment> getApartmentArray() {
        return apartmentArray;
    }

    public void addApartment(Apartment apartmentArray) {
        this.apartmentArray.add(apartmentArray);
    }

    public String toString() {
        return "Floor " + number+" number of apartments " + apartmentArray.size();
    }
}
