package day04.level02.selfproblems.ecommerceplatform;

public class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString method

    public String toString() {
        return name + " - $" + price;
    }

}
