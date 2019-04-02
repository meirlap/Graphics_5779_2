package main.geometries;

import main.primitives.Point3D;
import main.primitives.Ray;

import java.util.List;

public abstract class RadialGeometry  extends  Geometry{
    protected  double radius;

    public double getRadius() {
        return radius;
    }
    public RadialGeometry(RadialGeometry radial) {
        this.radius = radial.radius;
    }
    public RadialGeometry(double radius) {
        this.radius = radius;
    }

    public abstract List<Point3D> FindIntersections(Ray ray);
}
