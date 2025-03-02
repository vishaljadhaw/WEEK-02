package day04.level02.selfproblems.ecommerceplatform;
import java.util.List;
import java.util.ArrayList;

public class Order {
    private Customer customer;
    private List<Product> products;
    private static int orderCount = 0;
    private int orderId;

    // Constructor
    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.orderId = ++orderCount; // Unique order ID
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Get total price of the order
    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    // toString method for order details
    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Order ID: ").append(orderId).append("\n")
                .append("Customer: ").append(customer).append("\n")
                .append("Products: \n");
        for (Product product : products) {
            orderDetails.append("- ").append(product).append("\n");
        }
        orderDetails.append("Total Price: $").append(getTotalPrice()).append("\n");
        return orderDetails.toString();
    }
}
