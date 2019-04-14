package elements;

import main.elements.Camera;
import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CameraTest {

    @Test
    void constructRayThroughPixel_1() {
        //System.out.println("Test Ray Through Pixel");

        Vector vup = new Vector(0, 1, 0);
        Vector vto = new Vector(0, 0, -1);

        Camera c = new Camera(new Point3D(), vup, vto);

        Ray ray = c.constructRayThroughPixel(3, 3, 3
                , 3, 100, 150, 150);
        Point3D centerPoint = new Point3D(-100, -100, -100);
        Vector direction = new Vector(-0.5773502691896257, -0.5773502691896257, -0.5773502691896257);

        //x is negative why?
        Ray answer = new Ray(centerPoint, direction);
        assertEquals(answer.toString(), ray.toString());
        assertEquals(answer.getPOO(), ray.getPOO());
    }

    @Test
    public void constructRayThroughPixel_2() {
        final int WIDTH = 3;
        final int HEIGHT = 3;
        Point3D[][] screen = new Point3D[HEIGHT][WIDTH];
        Camera camera = new Camera(new Point3D(0, 0, 0), new Vector(0, 1, 0), new Vector(0, 0, -1));
        System.out.println("Camera:\n" + camera);

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                Ray ray = camera.constructRayThroughPixel(WIDTH, HEIGHT, i, j, 1, 3 * WIDTH, 3 * HEIGHT);
                screen[i][j] = ray.getPOO();
                System.out.print(screen[i][j]);
                System.out.print(ray.getDirection());
                double actualval = screen[i][j].getZ().get();
                assertEquals(-1.0, actualval);
                // Checking all options
                double x = screen[i][j].getX().get();
                double y = screen[i][j].getX().get();

                if (Double.compare(x, 3) == 0 || Double.compare(x, 0) == 0 || Double.compare(x, -3) == 0) {
                    if (Double.compare(y, 3) == 0 ||
                            Double.compare(y, 0) == 0 ||
                            Double.compare(y, -3) == 0) {
                        assertTrue(true);
                    } else {
                        fail("Wrong y coordinate");
                    }
                } else {
                    fail("Wrong x coordinate");
                }

            }
            System.out.println("--");
        }
    }
}