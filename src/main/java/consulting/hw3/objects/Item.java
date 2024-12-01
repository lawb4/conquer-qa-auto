package consulting.hw3.objects;

import java.util.UUID;

public class Item {
    private final String id;
    private String name;
    private double price;

    public Item(String name, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
