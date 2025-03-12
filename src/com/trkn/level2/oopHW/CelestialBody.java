package com.trkn.level2.oopHW;

public abstract class CelestialBody implements SpaceObject {
    private final String name;
    private final double mass;
    private final double radius;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public CelestialBody(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public boolean compareMass(SpaceObject other) {
        return this.mass > other.getMass();
    }

    public double calculateDiameter() {
        return 2 * radius;
    }
}
