package main.geometries;

import main.primitives.Point3D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle tr = new Triangle(
            new Point3D(0.0,1.0,0.0),
            new Point3D(1.0,0.0,0.0),
            new Point3D(0.0,0.0,1.0)
            );
    @Test
    void getNormal() {
        assertEquals(tr.getNormal(new Point3D()).toString(),"uuu");
    }
}