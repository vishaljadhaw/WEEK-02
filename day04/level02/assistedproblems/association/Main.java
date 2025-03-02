package day04.level02.assistedproblems.association;

public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Indian Bank");

        // Open accounts for customers
        bank.openAccount("John Don", "123456", 1000.0);
        bank.openAccount("Stive Smith", "654321", 2000.0);

        // List customers
        bank.listCustomers();

        // Access a customer's functionality
        Customer john = new Customer("John Don", "123456", 1000.0, bank);
        john.viewBalance();
        john.deposit(500.0);
        john.withdraw(300.0);
    }

}
