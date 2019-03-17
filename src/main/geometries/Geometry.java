package main.geometries;

import main.primitives.Point3D;
import main.primitives.Vector;

public abstract class Geometry {
    public  abstract Vector getNormal(Point3D point);
}
