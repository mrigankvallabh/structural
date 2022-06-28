package composite;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent component) {
        this.components.add(component);
        return component;
    }

    @Override
    public MenuComponent remove(MenuComponent component) {
        this.components.remove(component);
        return component;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.print(this));

        for (MenuComponent menuComponent : components) {
            builder.append(menuComponent.toString());
        }

        return builder.toString();
    }
}
