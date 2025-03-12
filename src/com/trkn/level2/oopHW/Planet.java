package com.trkn.level2.oopHW;

public class Planet extends CelestialBody implements SpaceObject {
    private final boolean hasAtmosphere;

    public Planet(String name, double mass, double radius, boolean hasAtmosphere) {
        super(name, mass, radius);
        this.hasAtmosphere = hasAtmosphere;
    }

}
