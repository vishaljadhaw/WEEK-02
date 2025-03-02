package day03.level01.vehicleregistrationsystem;

public class Vehicle {
    // Static variable for registration fee (shared by all vehicles)
    static double registrationFee = 500.0;

    // Final variable for unique registration number
    final String registrationNumber;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor to initialize instance variables using `this`
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee < 0) {
            System.out.println("Registration fee cannot be negative.");
            return;
        }
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Method to display vehicle details
    public void displayRegistrationDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Static method to validate if an object is an instance of the Vehicle class
    public static void validateObject(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("The object is a valid Vehicle instance.");
        } else {
            System.out.println("The object is not a Vehicle instance.");
        }
    }

}
