package main.geometries;

import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;

import java.util.List;

public interface Geometry {
    Vector getNormal(Point3D point);
    List<Point3D> findIntersections(Ray ray);
}
