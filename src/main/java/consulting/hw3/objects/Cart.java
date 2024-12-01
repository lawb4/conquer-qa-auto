package consulting.hw3.objects;

import java.util.HashSet;

public class Cart {
    private Customer customer;
    private HashSet<Item> items;

    public Cart(Customer customer, HashSet<Item> items) {
        this.customer = customer;
        this.items = items;
    }

    public HashSet<Item> getItems() {
        return items;
    }
}
