package day03.level01.shoppingcartsystem;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Update the discount percentage
        Product.updateDiscount(10.0);

        // Create product instances
        Product product1 = new Product("Laptop", 1000.0, 1);
        Product product2 = new Product("Smartphone", 800.0, 2);

        // Display product details
        product1.displayDetails();
        System.out.println();
        product2.displayDetails();

        // Validate object instances
        Product.validateObject(product1);
        Product.validateObject("Not a Product");
    }

}
