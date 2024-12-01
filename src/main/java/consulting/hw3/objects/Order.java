package consulting.hw3.objects;

public class Order {
    private String id;
    private Customer customer;
    private Cart cart;
    private boolean status;
    private double totalPrice;


    public Order(Cart cart) {
        this.cart = cart;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
