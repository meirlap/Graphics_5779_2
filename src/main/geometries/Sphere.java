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
        return null;
    }

    public Point3D getCenter() {
        return center;
    }

    public void setCenter(Point3D center) {
        this.center = center;
    }
}
