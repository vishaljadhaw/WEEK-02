package day05.multilevelinheritance.onlineretailordermanagement;

public class Order {
    // Attributes
    private String orderId;
    private String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    // Method to display basic order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

}
