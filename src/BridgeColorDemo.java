import bridgecolor.BlueColor;
import bridgecolor.Shape;
import bridgecolor.Square;

public class BridgeColorDemo {
    public static void main(String[] args) {

        Shape blueSquare = new Square(new BlueColor());
        blueSquare.applyColor();

        // Anonymous class with lambda usage for functional interface
        Shape greenCircle = new Shape(() -> "Applied Green") {
            private final String shape = "Circle";

            @Override
            public String getShape() {
                return shape;
            }

            @Override
            public void applyColor() {
                System.out.println(getShape() + " " + super.getColor().applyColor());
            }
        };

        greenCircle.applyColor();
    }

}
