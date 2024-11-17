package consulting.hw2.classes;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<String> purchaseHistory = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addPurchase(String item) {
        purchaseHistory.add(item);
    }

    public void printPurchaseHistory() {
        System.out.printf("Клиент: %s, История покупок: %s",
                this.name, this.purchaseHistory);
    }
}
