package main.geometries;

import main.primitives.Point3D;
import main.primitives.Vector;

import java.util.Objects;

public class Sphere  extends Geometry{
    public Sphere() {
    }

    public Sphere(Point3D center) {
        this.setCenter(center);
    }

    public Sphere(Point3D center, double r) {
        super();
        setCenter(center);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
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

    private Point3D center;

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
}
