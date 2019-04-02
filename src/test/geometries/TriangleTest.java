package geometries;

import main.primitives.*;
import  main.geometries.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

     @Test
    void getNormal() {
         Triangle tr = new Triangle(
                 new Point3D(0.0,1.0,0.0),
                 new Point3D(1.0,0.0,0.0),
                 new Point3D(0.0,0.0,1.0)
         );
          Vector n = tr.getNormal(null);
          assertEquals("Vector{head=Point3D{x=0.5773502691896258, y=0.5773502691896258, z=0.5773502691896258}}",n.toString());
    }
}