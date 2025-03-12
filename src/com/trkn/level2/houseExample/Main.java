package com.trkn.level2.houseExample;

import java.util.Random;

public class Main {
    private static final Random random = new Random();
    private static final int FLOOR_COUNT = 9;
    private static final int MIN_APARTMENTS = 3;
    private static final int MAX_APARTMENTS = 6;
    private static final int MIN_ROOMS = 2;
    private static final int MAX_ROOMS = 6;

    public static void main(String[] args) {
        House house = buildHouse();
        house.getClass();
        printAllInformation(house);
    }

    private static House buildHouse() {
        House house = new House(1);
        for (int floorNum = 1; floorNum <= FLOOR_COUNT; floorNum++) {
            Floor floor = buildFloor(floorNum);
            house.addFloor(floor);
        }
        return house;
    }

    private static Floor buildFloor(int floorNum) {
        Floor floor = new Floor(floorNum);
        int apartmentCount = random.nextInt(MIN_APARTMENTS, MAX_APARTMENTS);
        for (int aptNum = 1; aptNum < apartmentCount; aptNum++) {
            Apartment apartment = buildApartment(aptNum);
            floor.addApartment(apartment);
        }
        return floor;
    }

    private static Apartment buildApartment(int aptNum) {
        Apartment apartment = new Apartment(aptNum);
        int roomCount = random.nextInt(MIN_ROOMS, MAX_ROOMS);
        for (int i = roomCount; i > 0; i--) {
            Room room = new Room(aptNum % 2 == 0);
            apartment.addRoom(room);
        }
        return apartment;
    }

    private static void printAllInformation(House house) {
        System.out.println("🏠 House " + house.getNumber() + " (" + house.getFloorArray().size() + " floors)");
        System.out.println("═══════════════════════════════════");

        for (Floor floor : house.getFloorArray()) {
            System.out.println("├─ 📑 Floor " + floor.getNumber() + " (" + floor.getApartmentArray().size() + " apartments)");

            for (Apartment apartment : floor.getApartmentArray()) {
                System.out.println("│  ├─ 🚪 Apartment " + apartment.getNumber() + " (" + apartment.getRoomArray().size() + " rooms)");
            }
            System.out.println("│");
        }
    }

}
