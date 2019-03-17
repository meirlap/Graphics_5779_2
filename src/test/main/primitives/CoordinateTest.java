package main.primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    Coordinate c = new Coordinate(0.999999999999999999);
    @Test
    void toStringTest() {
        assertEquals("1.0",c.toString());
    }
    @Test
    void getTest() {
        assertEquals(1.0,c.get());
    }

}