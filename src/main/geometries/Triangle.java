package main.geometries;

import main.primitives.Point3D;
import main.primitives.Vector;

import java.util.Objects;

public class Triangle extends Plane {
    private Point3D p1;
    private Point3D p2;
    private  Point3D p3;

    public Point3D getP1() {
        return p1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getP1().equals(triangle.getP1()) &&
                getP2().equals(triangle.getP2()) &&
                getP3().equals(triangle.getP3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getP1(), getP2(), getP3());
    }

    public void setP1(Point3D p1) {
        this.p1 = p1;
    }

    public Point3D getP2() {
        return p2;
    }

    public void setP2(Point3D p2) {
        this.p2 = p2;
    }

    public Point3D getP3() {
        return p3;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "p1=" + getP1() +
                ", p2=" + getP2() +
                ", p3=" + getP3() +
                '}';
    }

    public void setP3(Point3D p3) {
        this.p3 = p3;
    }

    public Triangle(Point3D p1, Point3D p2, Point3D p3) {
        super(p1,p2,p3);
        this.setP1(p1);
        this.setP2(p2);
        this.setP3(p3);
    }
}
