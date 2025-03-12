package com.trkn.level2.oopHW;

public final class SpaceUtils {
    private SpaceUtils() {}

    public static double calculateGravity(SpaceObject object1, SpaceObject object2, double distance) {
        final double G = 6.67430e-11;
        return G * (object1.getMass() * object2.getMass()) / (distance * distance);
    }

    static boolean isStar(SpaceObject object) {
        return object instanceof Star;
    }

}
