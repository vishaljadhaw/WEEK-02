package day02.level01.commonpracticeproblem.carrentalsystem;

public class Car {
    public static void main(String[] args) {
        CarRentalSystem carRental = new CarRentalSystem("John Doe", "Toyota", 5);
        System.out.println("Total Cost: $" + carRental.calculateTotalCost());
    }

}
