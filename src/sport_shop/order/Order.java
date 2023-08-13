package sport_shop.order;

import sport_shop.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getTotalCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.getName());
            System.out.println("Manufacturer: " + item.getManufacturer().getManufacturer());
            System.out.println("Color: " + item.getColor());
            System.out.println("Price: " + item.getPrice());
        }
    }
}
