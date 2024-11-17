package consulting.hw2.classes;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printCarInfo() {
        System.out.printf("Бренд: %s, Модель: %s, Год: %d, Цена: %s \n",
                this.brand, this.model, this.year, String.format("%.3f", this.price));
    }
}