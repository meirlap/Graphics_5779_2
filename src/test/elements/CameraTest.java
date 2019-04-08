package elements;

import main.elements.Camera;
import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CameraTest {

    @Test
    void constructRayThroughPixel() {
        //System.out.println("Test Ray Through Pixel");

        Vector vup = new Vector(0, 1, 0);
        Vector vto = new Vector(0, 0, -1);

        Camera c = new Camera(new Point3D(),vup, vto);

        Ray ray = c.constructRayThroughPixel(3, 3, 3
                , 3, 100, 150, 150);
        Point3D centerPoint = new Point3D(-100, -100, -100);
        Vector direction = new Vector(-0.5773502691896257, -0.5773502691896257, -0.5773502691896257);

        //x is negative why?
        Ray answer = new Ray(centerPoint, direction);
        assertEquals(answer.toString(), ray.toString());
    }
}