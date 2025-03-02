package day03.level01.bankaccountsystem;

public class BankAccountSystem {
    // Attributes to store the values
    static String bankName;
    static int totalAccounts = 0;
    String accountHolderName;
    private final int accountNumber;

    // Constructor to initialize the values and increment the total accounts
    BankAccountSystem(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Method to display the total accounts
    static void getTotalAccounts(){
        System.out.println("Total number of Accounts: "+ totalAccounts);
    }

    // Method to display the details
    void displayDetails(){
        System.out.println("Account Holder Name: "+ accountHolderName);
        System.out.println("Account Number: "+ accountNumber);
    }


}
