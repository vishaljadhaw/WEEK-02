package day04.level01.billgenerateapplication;

public class Main {
    public static void main(String[] args) {
        // Creating products
        Product p1 = new Product("Apples", 100.00, 11);
        Product p2 = new Product("Mango", 500.00, 20);

        // Creating customer and adding products
        Customer customer = new Customer("Arun", 101);
        customer.addProduct(p1);
        customer.addProduct(p2);

        // Generating bill
        BillGenerator billGenerator = new BillGenerator();
        double total = billGenerator.computeTotal(customer);
        System.out.println("Total Bill: $" + total);
    }

}
