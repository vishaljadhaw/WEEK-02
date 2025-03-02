package day02.level01.instanceclass.vehicleregistration;

public class Vehicle {
    public static void main(String[] args) {
        // Create an instance of VehicleRegistration
        VehicleRegistration vehicle1 = new VehicleRegistration("John Doe", "Car");
        vehicle1.displayVehicleDetails();

        // Update the registration fee
        VehicleRegistration.updateRegistrationFee(200.0);
        System.out.println("Updated registration fee: ");
        vehicle1.displayVehicleDetails();
    }

}
