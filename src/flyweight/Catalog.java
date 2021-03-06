package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Item> items = new HashMap<>();

    public Item lookupItem(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }

        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
