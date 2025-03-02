package day04.level02.assistedproblems.association;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Attributes
    private String bankName;
    private List<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(String customerName, String accountNumber, double initialBalance) {
        Customer customer = new Customer(customerName, accountNumber, initialBalance, this);
        customers.add(customer);
        System.out.println("Account opened for " + customerName + " with account number " + accountNumber);
    }

    // Method to list all customers
    public void listCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println(customer.getCustomerName() + " - Account Number: " + customer.getAccountNumber());
        }
    }

    public String getBankName() {
        return bankName;
    }

}
