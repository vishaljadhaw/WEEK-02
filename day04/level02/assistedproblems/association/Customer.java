package day04.level02.assistedproblems.association;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private String accountNumber;
    private double balance;
    private Bank bank;

    // Constructor
    public Customer(String customerName, String accountNumber, double balance, Bank bank) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    // Method to view balance
    public void viewBalance() {
        System.out.println("Balance for account " + accountNumber + ": " + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
