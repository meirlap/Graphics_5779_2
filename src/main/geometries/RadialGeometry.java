package main.geometries;

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
}
