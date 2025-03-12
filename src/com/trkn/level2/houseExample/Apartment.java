package com.trkn.level2.houseExample;

import java.util.ArrayList;

public class Apartment {
    private final int number;
    private final ArrayList<Room> roomArray  = new ArrayList<>();

    public Apartment(int number) {
        this.number = number;
    }

    public int getNumber() {
         return number;
    }

    public ArrayList<Room> getRoomArray() {
        return roomArray;
    }

    public void addRoom(Room room) {
        this.roomArray.add(room);
    }

    public String toString() {
        return "Apartment " + number+" number of rooms " + roomArray.size();
    }
}
