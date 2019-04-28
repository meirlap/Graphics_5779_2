package main.geometries;

import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;

import java.util.List;

public abstract class RadialGeometry extends Geometry {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public RadialGeometry(RadialGeometry radial) {
        this.radius = radial.radius;
    }

    public RadialGeometry(double radius) {
        this.radius = radius;
    }

    @Override
    public abstract List<Point3D> findIntersections(Ray ray);

    @Override
    public abstract Vector getNormal(Point3D point);

}
