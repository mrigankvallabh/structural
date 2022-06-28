import decorator.DressingDecorator;
import decorator.MeatDecorator;
import decorator.Sandwich;
import decorator.SimpleSandwich;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich mySandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(mySandwich.make());
    }

}
