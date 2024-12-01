package consulting.hw3.objects;

import java.util.HashSet;

public class Customer {
    private String id;
    private String name;
    private Cart cart;
    private Order order;

    public Customer(String
                            id, String name, Cart cart) {
        this.id = id;
        this.name = name;
        this.cart = new Cart(this, new HashSet<>());
    }

    public void addItem(Item item) {
        cart.getItems().add(item);
    }

    public void removeItem(Item item) {
        cart.getItems().remove(item);
    }

    public Order createOrder(Cart cart) {
        return new Order(cart);
    }

    public void pay(Cart cart) {

    }
}
