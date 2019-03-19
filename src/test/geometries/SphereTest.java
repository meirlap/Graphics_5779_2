package geometries;

import main.geometries.Sphere;
import main.primitives.Point3D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    Sphere s = new Sphere(1, new Point3D(0, 0, 1));
    @Test
    void getNormalTest() {
        Point3D p = new Point3D(0,1,1);
        assertEquals(1,s.getNormal(p).length(),1e-10);
    }
}