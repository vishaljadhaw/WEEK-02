package day02.level01.acessmodifiers.bankaccountmanagement;

public class BankAccountManagement {
    // Declare the attributes
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Parameterized constructor to initialize the attributes
    public BankAccountManagement(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access the balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
