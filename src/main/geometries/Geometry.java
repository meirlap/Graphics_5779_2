package main.geometries;

import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;

import java.util.List;

public abstract class Geometry {
    public  abstract Vector getNormal(Point3D point);

    public abstract List<Point3D> FindIntersections(Ray ray);
}
