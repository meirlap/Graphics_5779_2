package main.geometries;

import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Triangle extends Plane {
    private Point3D p1;
    private Point3D p2;
    private Point3D p3;

    public Point3D getP1() {
        return p1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getP1().equals(triangle.getP1()) &&
                getP2().equals(triangle.getP2()) &&
                getP3().equals(triangle.getP3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getP1(), getP2(), getP3());
    }

    public void setP1(Point3D p1) {
        this.p1 = p1;
    }

    public Point3D getP2() {
        return p2;
    }

    public void setP2(Point3D p2) {
        this.p2 = p2;
    }

    public Point3D getP3() {
        return p3;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "p1=" + getP1() +
                ", p2=" + getP2() +
                ", p3=" + getP3() +
                '}';
    }

    public void setP3(Point3D p3) {
        this.p3 = p3;
    }

    public Triangle(Point3D p1, Point3D p2, Point3D p3) {
        super(p1, p2, p3);
        this.setP1(p1);
        this.setP2(p2);
        this.setP3(p3);
    }

    @Override
    public List<Point3D> findIntersections(Ray ray) {

        List<Point3D> intersectionPoints = new ArrayList<Point3D>(1);

        // Intersecting the triangular plane

        Point3D P0 = ray.getPOO();

        Vector N = getNormal(null);
        Plane plane = new Plane(N, p3);
        //Plane myplane = (Plane)this;
        if (plane.findIntersections(ray).isEmpty())
            return intersectionPoints;

        Point3D intersectionPlane = plane.findIntersections(ray).get(0);

        // Checking if the interseculating point is bounded by the triangle
        Vector P_P0 = new Vector(P0, intersectionPlane);

        // Checking 1/3 triangular side
        Vector V1_1 = new Vector(P0, this.p1);
        Vector V2_1 = new Vector(P0, this.p2);
        Vector N1 = V1_1.crossProduct(V2_1);
        N1.normalize();
        double S1 = -P_P0.dotProduct(N1);

        // Checking 2/3 triangular side
        Vector V1_2 = new Vector(P0, this.p2);
        Vector V2_2 = new Vector(P0, this.p3);
        Vector N2 = V1_2.crossProduct(V2_2);
        N2.normalize();
        double S2 = -P_P0.dotProduct(N2);

        // Checking 1/3 triangular side
        Vector V1_3 = new Vector(P0, this.p3);
        Vector V2_3 = new Vector(P0, this.p1);
        Vector N3 = V1_3.crossProduct(V2_3);
        N3.normalize();
        double S3 = -P_P0.dotProduct(N3);

        if (((S1 > 0) && (S2 > 0) && (S3 > 0)) ||
                ((S1 < 0) && (S2 < 0) && (S3 < 0))) {
            intersectionPoints.add(intersectionPlane);
        }

        return intersectionPoints;

    }
}
