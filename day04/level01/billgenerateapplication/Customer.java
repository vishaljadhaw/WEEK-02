package day04.level01.billgenerateapplication;
import java.util.ArrayList;

public class Customer {
    String name;
    int id;
    ArrayList<Product> products;  // Using ArrayList instead of fixed-size array

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.products = new ArrayList<>();  // Initialize the product list
    }

    public void addProduct(Product product) {
        products.add(product);  // Adding product to the customer's product list
    }

    public void removeProduct(Product product) {
        products.remove(product);  // Removing product from the list
    }

}
