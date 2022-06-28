package bridgecolor;

public class Square extends Shape {

    private final String shape = "Square";

    public Square(Color color) {
        super(color);
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public void applyColor() {
        System.out.println(getShape() + " " + super.getColor().applyColor());
    }
}
