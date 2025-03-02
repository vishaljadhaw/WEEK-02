package day02.level01.instanceclass.productinventory;

public class Product {
    public static void main(String[] args) {
        // Create instances of ProductInventory

        ProductInventory product1 = new ProductInventory("Laptop", 1000.0);
        ProductInventory product2 = new ProductInventory("Mobile", 500.0);
        ProductInventory product3 = new ProductInventory("Tablet", 800.0);
        ProductInventory.displayTotalProducts();

        // Display product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

    }

}
