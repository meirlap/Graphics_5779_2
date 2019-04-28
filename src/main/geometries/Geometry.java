package main.geometries;

import main.primitives.Color;
import main.primitives.Point3D;
import main.primitives.Ray;
import main.primitives.Vector;

import java.util.List;

public abstract class Geometry implements IGeometry {
    private Color _emmission = new Color(0, 0, 0);

    public Color getEmmission() {
        return _emmission;
    }
}
