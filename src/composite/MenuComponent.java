package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> components = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        return new StringBuilder(name).append(": ").append(url).append("\n").toString();
    }

    public MenuComponent add(MenuComponent component) {
        throw new UnsupportedOperationException("Feature not implemented at this level.");
    }

    public MenuComponent remove(MenuComponent component) {
        throw new UnsupportedOperationException("Feature not implemented at this level.");
    }

}
