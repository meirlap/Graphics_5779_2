package main.primitives;

public class Color {
    java.awt.Color _color;

    public Color() {
        _color = new java.awt.Color(255, 255, 255);
    }

    public Color(Color color) {
        setColor(color.getColor());
    }

    public Color(java.awt.Color color) {
        setColor(color);

    }

    public Color(double r, double g, double b) {
        setColor(r, g, b);
    }

    public Color(int r, int g, int b) {
        setColor(r, g, b);
    }

    public void setColor(double r, double g, double b) {
        this._color = new java.awt.Color((float) r, (float) g, (float) b);
    }

    public void setColor(int r, int g, int b) {
        this._color = new java.awt.Color(r, g, b);
    }

    public void setColor(Color color) {
        this._color = color.getColor();
    }

    private void setColor(java.awt.Color color) {
        this._color = new java.awt.Color
                (
                        color.getRed(),
                        color.getGreen(),
                        color.getBlue()
                );
    }

    private java.awt.Color getColor() {
        return new java.awt.Color(_color.getRGB());
    }

}
