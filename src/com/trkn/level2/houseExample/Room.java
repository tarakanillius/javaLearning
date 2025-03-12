package com.trkn.level2.houseExample;

public class Room {
    private final boolean passThrough;

    public Room(boolean passThrough) {
        this.passThrough = passThrough;
    }

    public String toString() {
        return "Room " + (passThrough ? "passThrough" : "not passThrough");
    }
}
