package primitives;

import java.util.Objects;

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
