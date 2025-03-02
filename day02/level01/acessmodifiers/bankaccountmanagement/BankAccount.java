package day02.level01.acessmodifiers.bankaccountmanagement;

public class BankAccount {
    public static void main(String[] args) {

        // Create an object of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("1234567890", "John Doe",1000.0);
        savingsAccount.displayAccountInfo();
        System.out.println("Current Balance after deposit: " + savingsAccount.getBalance());
        System.out.println();


        // Access and modify balance using public methods
        savingsAccount.setBalance(2000.0);
        System.out.println("Current Balance after modification: " + savingsAccount.getBalance());

    }

}
