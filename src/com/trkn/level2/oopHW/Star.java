package com.trkn.level2.oopHW;

public class Star extends CelestialBody implements SpaceObject {
    private final double luminosity;

    public double getLuminosity() {
        return luminosity;
    }

    public Star(String name, double mass, double radius, double luminosity) {
        super(name, mass, radius);
        this.luminosity = luminosity;
    }
}
