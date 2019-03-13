package main.primitives;

import java.util.Objects;

import static java.lang.StrictMath.sqrt;

public class Point2D {
    protected Coordinate x;
    protected Coordinate y;

    public Point2D() {
        setX(Coordinate.ZERO);
        setY(Coordinate.ZERO);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o== null) return false;
        if (!(o instanceof Point2D)) return false;
        Point2D point2D = (Point2D) o;
        return getX().equals(point2D.getX()) &&
                getY().equals(point2D.getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    public double distance(Point2D other)
    {
        double xx= Util.uscale((other.getX().get()-getX().get()),(other.getX().get()-getX().get()));
        double yy= Util.uscale((other.getY().get()-getY().get()),(other.getY().get()-getY().get()));

        return  sqrt(xx+yy);
    }

    @Override
    public String toString() {
        //return "(" + _x.getX() + " , " + _y.getY() + ")" ;
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
    public Point2D(Point2D other) {
        this.setX(other.getX());
        this.setY(other.getY());
    }

    public Point2D(Coordinate x, Coordinate y) {
        this.setX(x);
        this.setY(y);
    }

    public Coordinate getX() {
        return new Coordinate(x);
    }
    public Coordinate getY() {
        return new Coordinate(y);
    }

    public void setX(Coordinate x) {
        this.x = new Coordinate(x);
    }
    public void setY(Coordinate y) {
        this.y = new Coordinate(y);
    }
}
