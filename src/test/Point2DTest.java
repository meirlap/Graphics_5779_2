package test;

import main.primitives.Coordinate;
import main.primitives.Point2D;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    Point2D p = new Point2D(new Coordinate(2.05),new Coordinate(3.567));

    @org.junit.jupiter.api.Test
    void toStringTest() {
        System.out.println(p.toString());
        String expected = "kuku";
        assertEquals("jojo",p.toString());
    }
}