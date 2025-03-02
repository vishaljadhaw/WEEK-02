package day02.level01.instanceclass.vehicleregistration;

public class VehicleRegistration {
    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable
    static double registrationFee = 100.0;

    //Parameterized Constructor
    VehicleRegistration(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method to display vehicle details
    void displayVehicleDetails(){
        System.out.println();
        System.out.println("Registration fee: " + registrationFee);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }

    // Class Method to update registration fee
    static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
    }

}
