package consulting.hw3.objects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

public class Customer {
    private final String id;
    private String name;
    private Cart cart;
    private HashSet<Order> orders;

    public Customer(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.cart = new Cart(this);
        this.orders = new HashSet<>();
    }

    public Cart getCart() {
        return cart;
    }

    public void addItem(Item item, int quantity) {
        cart.addItem(item, quantity);
    }

    public void removeItem(Item item, int quantity) {
        cart.removeItem(item, quantity);
    }

    public Order createOrder() {
        Order order = new Order(this, new HashMap<>(cart.getItems()));
        orders.add(order);
        cart.clearCart();
        return order;
    }

    public void payOrder(Order order) {
        order.setStatus(OrderStatus.PAID);
    }

    public void printCartItems() {
        for (Map.Entry<Item, Integer> item : cart.getItems().entrySet()) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
