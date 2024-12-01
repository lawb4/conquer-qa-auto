package consulting.hw3.objects;

import java.util.HashMap;
import java.util.UUID;

public class Order {
    private final String id;
    private Customer customer;
    private HashMap<Item, Integer> items;
    private OrderStatus status;
    private double totalPrice;


    public Order(Customer customer, HashMap<Item, Integer> items) {
        this.id = UUID.randomUUID().toString();
        this.customer = customer;
        this.items = items;
        this.status = OrderStatus.NEW;
        this.totalPrice = calculateTotalPrice();
    }

    public String getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private double calculateTotalPrice() {
        totalPrice = 0;
        for (Item item : items.keySet()) {
            totalPrice += item.getPrice() * items.get(item);
        }
        return totalPrice;
    }
}
