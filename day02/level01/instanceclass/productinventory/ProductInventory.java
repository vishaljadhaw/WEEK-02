package day02.level01.instanceclass.productinventory;

public class ProductInventory {
    // Instance Variables
    private String ProductName;
    private double Price;

    // Class Variable
    public static int totalProducts;

    ProductInventory(String name, double price){
        this.ProductName = name;
        this.Price = price;
        totalProducts++;
    }

    // Instance Method
    public void displayProductDetails(){

        System.out.println("Product Name: " + ProductName);
        System.out.println("Price: $" + Price);
        System.out.println();

    }

    // Class Method
    public static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
        System.out.println();
    }


}
