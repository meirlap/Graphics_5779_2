package geometries;

import main.geometries.Plane;
import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void getNormalTest() {
        assertTrue(true);
    }
    @Test
    void  getintersectionsTest()
    {
        // creating the expected values

        List<Point3D> answerList = new ArrayList<Point3D>();
        Point3D answerPoint = new Point3D(0, 0, -200);
        answerList.add(answerPoint);

        // building the plane

        Point3D directionPoint = new Point3D(0, 0, -1);
        Point3D planePoint = new Point3D(0, 100, -200);

        Vector direction = new Vector(directionPoint);

        Plane plane = new Plane(direction,planePoint);

        // building the ray that will intersect the plane

        Point3D centerPoint = new Point3D(0,0,0);
        Vector vector = new Vector(0, 0, -5);
        Ray ray = new Ray(centerPoint, vector);

        // testing the findIntersection function

        List<Point3D> list = new ArrayList<Point3D>();
        list = plane.findIntersections(ray);
        assertEquals(answerList, list);
    }
}
