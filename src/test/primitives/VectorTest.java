package primitives;

import main.primitives.Point3D;
import main.primitives.Vector;

import static org.junit.jupiter.api.Assertions.*;


class VectorTest {

    @org.junit.jupiter.api.Test
    void testNormalize() {
        Vector v = new Vector(new Point3D(.5, -5, 10));
        v.normalize();
        assertEquals(1, v.length(), 1e-10);
        v = new Vector();
        try {
            v.normalize();
            fail("Didn't throw divide by zero exception!");
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }
}