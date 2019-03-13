package main.primitives;

import java.util.Objects;

import static java.lang.StrictMath.sqrt;

public class Point3D extends Point2D{
    private Coordinate z;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null) return false;
        if (!(o instanceof Point3D)) return false;
        if (!super.equals(o)) return false;
        Point3D point3D = (Point3D) o;
        return getZ().equals(point3D.getZ());
    }

    public  Vector substract(Point3D pt)
    {
        return new Vector(pt,this);
    }
    public double distance(Point3D other)
    {
        double xx= Util.uscale((other.getX().get()-getX().get()),(other.getX().get()-getX().get()));
        double yy= Util.uscale((other.getY().get()-getY().get()),(other.getY().get()-getY().get()));
        double zz= Util.uscale((other.getZ().get()-getZ().get()),(other.getZ().get()-getZ().get()));

        //return  sqrt(xx+yy+zz);
        return (Util.uadd(zz,Util.uadd(xx,yy)));
    }

    public Point3D addVector(Vector v)
    {
        Point3D p_vec = v.getHead();

        Point3D result = new Point3D(
                this.getX().add(p_vec.getX()),
                this.getY().add(p_vec.getY()),
                this.getZ().add(p_vec.getZ()));
        return  result;
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + getZ() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getZ());
    }

    public Point3D() {
        this.setZ(Coordinate.ZERO);
    }

    public Point3D(Point3D other) {
        this.setX(other.getX());
        this.setY(other.getY());
        this.setZ(other.getZ());
    }

    public Point3D(Coordinate x, Coordinate y, Coordinate z) {
        super(x, y);
        this.setZ(z);
    }

    public Coordinate getZ() {
        return  new Coordinate(z);
    }

    public void setZ(Coordinate z) {
        this.z =  new Coordinate(z);
    }
}
