package bridgecolor;

public abstract class Shape {
    private final Color color;
    private final String shape = "Circle";

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public abstract void applyColor();
}
