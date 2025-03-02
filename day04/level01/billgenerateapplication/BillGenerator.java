package day04.level01.billgenerateapplication;

public class BillGenerator {
    public double computeTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.products) {
            total += product.price * product.quantity;  // Calculate total cost for each product
        }
        return total;
    }

}
