package com.trkn.level2.oopHW;

public class Moon extends CelestialBody implements SpaceObject {
    private final Planet hostPlanet;

    public Moon(String name, double mass, double radius, Planet hostPlanet) {
        super(name, mass, radius);
        this.hostPlanet = hostPlanet;
    }

    public Planet getHostPlanet() {
        return hostPlanet;
    }
}
