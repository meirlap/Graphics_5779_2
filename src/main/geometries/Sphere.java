package main.geometries;

import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// al taatik stam kacha -- tachshov kodem !!
public class Sphere  extends RadialGeometry{

    private Point3D center;

    public Sphere(){
        super(0.0);
        setCenter(new Point3D());
    }

    public Sphere (Sphere sphere){
        super(sphere.getRadius());
        setCenter(sphere.getCenter());
    }

    public Sphere(double radius, Point3D center){
        super(radius);
        setCenter(center);
    }

    public Sphere(Point3D center, double radius) {
        this(radius, center);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Sphere)) return false;
        Sphere sphere = (Sphere) o;
        return getCenter().equals(sphere.getCenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCenter());
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "center=" + getCenter() +
                '}';
    }
  @Override
    public Vector getNormal(Point3D point) {
        Vector N = new Vector(center, point);
        N.normalize();
        return N;

    }

    public Point3D getCenter() {
        return new Point3D(center);
    }

    public void setCenter(Point3D center) {
        this.center = new Point3D(center);
    }

    // TO DO
    //replace pow and other arithmetic fubction with Util methods

    @Override
    public List<Point3D> FindIntersections(Ray ray) {
        List<Point3D> intersectionPoints= new ArrayList<Point3D>(2);

        Vector L = new Vector(ray.getPOO(), this.getCenter());
        double tm = L.dotProduct(ray.getDirection());
        double d = Math.sqrt((L.length()*L.length()) - (tm*tm));

        if (d > this.getRadius())
            return intersectionPoints;

        double th = Math.sqrt((this.getRadius()*this.getRadius()) - (d*d));

        double t1 = tm - th;
        double t2 = tm + th;

        if (t1 >= 0){
            Vector V = ray.getDirection();
            V.scale(t1);
            Point3D p = ray.getPOO();
            Point3D P1 =p.addVector(V);
            intersectionPoints.add(P1);
        }

        if (t2 >= 0){
            Vector V = ray.getDirection();
            V.scale(t2);
            Point3D p = ray.getPOO();
            Point3D P2 =p.addVector(V);
            intersectionPoints.add(P2);
        }

        return intersectionPoints;
    }
}
