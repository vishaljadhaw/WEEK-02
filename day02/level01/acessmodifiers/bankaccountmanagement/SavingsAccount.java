package day02.level01.acessmodifiers.bankaccountmanagement;

public class SavingsAccount extends BankAccountManagement{
    // Constructor to initialize the attributes
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    // Method to access accountNumber and accountHolder
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }


}
