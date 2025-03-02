package day03.level01.bankaccountsystem;

public class BankAccount {
    public static void main(String[] args) {
        // Constructor calling
        BankAccountSystem account1 = new BankAccountSystem("Jethalal Gadda", 7709232);
        BankAccountSystem account2 = new BankAccountSystem("Jane Doe", 4375732);

        // Use the instenceOf method to check if the object is an instance of the class
        if (account1 instanceof BankAccountSystem) {
            account1.displayDetails();
        }
        if (account2 instanceof BankAccountSystem) {
            account2.displayDetails();
        }

        // Call the static method to display the total accounts
        BankAccountSystem.getTotalAccounts();

    }


}
