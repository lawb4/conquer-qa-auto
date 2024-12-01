package consulting.hw3.objects;

import java.util.HashMap;

public class Cart {
    private final Customer customer;
    private HashMap<Item, Integer> items;

    public Cart(Customer customer) {
        this.customer = customer;
        this.items = new HashMap<>();
    }

    public HashMap<Item, Integer> getItems() {
        return items;
    }

    public void addItem(Item item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public void removeItem(Item item, int quantity) {
        int currentQuantity = items.getOrDefault(item, 0);

        if (currentQuantity <= quantity) {
            items.remove(item);
        } else {
            items.put(item, currentQuantity - quantity);
        }
    }

    public void clearCart() {
        items.clear();
    }
}
