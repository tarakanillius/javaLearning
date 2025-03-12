package com.trkn.level2.oopPractice2;

public interface WithRadius {
    double getRadius();

    default double getDiameter() {
        return 2 * getRadius();
    }
}
