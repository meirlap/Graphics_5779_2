package main.geometries;

import main.primitives.*;

import java.util.List;

public interface IGeometry {
    Vector getNormal(Point3D point);

    List<Point3D> findIntersections(Ray ray);
}
