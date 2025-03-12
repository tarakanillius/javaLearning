package com.trkn.level2.oopPractice2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeTests {

    @Test
    public void testAreaCalculation() {
        Shape rectangle = new Rectangle(new Point(0,0), new Point(4,5));
        Shape triangle = new Triangle(new Point(0,0), new Point(4,0), new Point(2,5));
        Shape circle = new Circle(5);
        Shape square = new Square(new Point(0,0), new Point(4,4));

        double expectedRectangleArea = 20.0;
        double expectedTriangleArea = 10.0;
        double expectedCircleArea = Math.PI * 25;
        double expectedSquareArea = 16.0;

        assertEquals("Rectangle area calculation is incorrect", expectedRectangleArea, rectangle.getArea(), 0.001);
        assertEquals("Triangle area calculation is incorrect", expectedTriangleArea, triangle.getArea(), 0.001);
        assertEquals("Circle area calculation is incorrect", expectedCircleArea, circle.getArea(), 0.001);
        assertEquals("Square area calculation is incorrect", expectedSquareArea, square.getArea(), 0.001);
    }

    @Test
    public void testPerimeterCalculation() {
        WithPerimeter rectangle = new Rectangle(new Point(0,0), new Point(4,5));
        WithPerimeter triangle = new Triangle(new Point(5,5), new Point(5,0), new Point(0,4));
        WithPerimeter square = new Square(new Point(0,0), new Point(0,5));

        double expectedRectanglePerimeter = 18.0;
        double expectedTrianglePerimeter = 16.5;
        double expectedSquarePerimeter = 20.0;

        assertEquals("Rectangle perimeter calculation is incorrect", expectedRectanglePerimeter, rectangle.getPerimeter(), 0.001);
        assertEquals("Triangle perimeter calculation is incorrect", expectedTrianglePerimeter, triangle.getPerimeter(), 0.01);
        assertEquals("Square perimeter calculation is incorrect", expectedSquarePerimeter, square.getPerimeter(), 0.001);
    }

    @Test
    public void testDiagonalCalculation() {
        WithDiagonal rectangle = new Rectangle(new Point(0,0), new Point(4,5));
        WithDiagonal square = new Square(new Point(0,0), new Point(4,4));

        double expectedRectangleDiagonal = Math.sqrt(41);
        double expectedSquareDiagonal = Math.sqrt(32);

        assertEquals("Rectangle diagonal calculation is incorrect", expectedRectangleDiagonal, rectangle.getDiagonal(), 0.001);
        assertEquals("Square diagonal calculation is incorrect", expectedSquareDiagonal, square.getDiagonal(), 0.001);
    }

    @Test
    public void testEqualsArea() {
        Shape rectangle1 = new Rectangle(new Point(4,0), new Point(0,5));
        Shape rectangle2 = new Rectangle(new Point(0,2), new Point(10,0));
        Shape circle = new Circle(Math.sqrt(20/Math.PI));

        assertEquals("Shapes should have equal areas", rectangle1.getArea(),rectangle2.getArea(),0.0001);
        assertEquals("Circle and rectangle should have equal areas", rectangle1.getArea(),circle.getArea(),0.0001);
    }

    @Test
    public void testShapeUtils() {
        Shape rect = new Rectangle(new Point(4,0), new Point(0,1));
        Shape tri = new Triangle(new Point(4,0), new Point(0,5), new Point(2,9));
        Shape circle = new Circle(5);
        Shape square = new Square(new Point(0,0), new Point(4,4));

        assertTrue("Shape should be rectangle", ShapeUtils.isRectangle(rect));
        assertFalse("Shape should not be rectangle", ShapeUtils.isRectangle(tri));
        assertTrue("Shape should be triangle", ShapeUtils.isTriangle(tri));
        assertFalse("Shape should not be triangle", ShapeUtils.isTriangle(circle));
        assertTrue("Shape should be circle", ShapeUtils.isCircle(circle));
        assertTrue("Shape should be square", ShapeUtils.isSquare(square));
    }

    @Test
    public void testToStringOverride() {
        Shape square = new Square(new Point(4,0), new Point(0,5));
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(new Point(0,0), new Point(4,0), new Point(2,5));

        assertNotNull("toString() should not return null", square.toString());
        assertNotNull("toString() should not return null", circle.toString());
        assertNotNull("toString() should not return null", triangle.toString());

        assertFalse("toString() should be overridden", square.toString().startsWith(square.getClass().getName() + "@"));
        assertFalse("toString() should be overridden", circle.toString().startsWith(circle.getClass().getName() + "@"));
        assertFalse("toString() should be overridden", triangle.toString().startsWith(triangle.getClass().getName() + "@"));
    }
}
