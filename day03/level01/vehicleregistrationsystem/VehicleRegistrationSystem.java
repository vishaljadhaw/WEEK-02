package day03.level01.vehicleregistrationsystem;

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Update the registration fee
        Vehicle.updateRegistrationFee(600.0);

        // Create vehicle instances
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "REG12345");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "REG54321");

        // Display registration details
        System.out.println("\nVehicle 1 Details:");
        vehicle1.displayRegistrationDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayRegistrationDetails();

        // Validate object instances
        System.out.println("\nValidation:");
        Vehicle.validateObject(vehicle1); // Should be valid
        Vehicle.validateObject("Not a Vehicle"); // Should not be valid
    }

}
