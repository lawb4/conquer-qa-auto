package consulting.hw2.classes;

public class Currency {
    private String name;
    private double rateToUSD;

    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }

    public double convertToUSD(double amount) {
        return this.rateToUSD * amount;
    }

    public void printCurrencyInfo() {
        System.out.printf("Валюта: %s, Курс к USD: %.4f\n",
                this.name, this.rateToUSD);
    }
}
