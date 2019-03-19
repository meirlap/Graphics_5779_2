package main.geometries;

import main.primitives.Point3D;
import main.primitives.Vector;

import java.util.Objects;

public class Plane  extends Geometry{
    protected Point3D p;
    protected Vector N;

    public Plane(Point3D p1, Point3D p2, Point3D p3) {
        Vector U = new Vector (p1, p2);
        Vector V = new Vector (p1, p3);
        Vector n = new Vector (U.crossProduct(V));

        n.normalize();
        n.scale(-1);

        setP(p1);
        setN(n);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        if(o == null)return false;
        Plane plane = (Plane) o;
        return getP().equals(plane.getP()) &&
                getNormal(null).equals(plane.getNormal(null));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getP(), getNormal(null));
    }

    public Plane(Point3D p1, Vector n) {
        this.setP(p1);
        this.setN(n);
    }

    @Override
    public Vector getNormal(Point3D point) {
        return new Vector(N);
    }

    public Point3D getP() {
        return new Point3D(p);
    }

    public void setP(Point3D p) {
        this.p = new Point3D(p);
    }

    public void setN(Vector n) {
        N =  new Vector(N);
    }
}
