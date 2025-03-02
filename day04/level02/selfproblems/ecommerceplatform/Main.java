package day04.level02.selfproblems.ecommerceplatform;

public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 799.99);
        Product product3 = new Product("Headphones", 199.99);

        // Create a customer
        Customer customer = new Customer("Arun Shah", "arunshah345@gmail.com");

        // Create an order for the customer
        Order order = new Order(customer);

        // Add products to the order
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        // Display the order details
        System.out.println(order);
    }

}
