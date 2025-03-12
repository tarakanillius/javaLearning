package com.trkn.level2.oopPractice;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getArea() {
        assertEquals(20, new Rectangle(new Point(0,0), new Point(4,5)).getArea(), 0.001);
    }

    @Test
    public void getDiagonal() {
        assertEquals(5, new Rectangle(new Point(0,0), new Point(0,5)).getDiagonal(), 0.001);
    }
}