package day02.level01.commonpracticeproblem.hotelmanagementsystem;

public class Hotel {
    public static void main(String[] args) {
        // Call the constructor
        HotelBookingSystems booking1 = new HotelBookingSystems();
        HotelBookingSystems booking2 = new HotelBookingSystems("Rahul", "Deluxe Room", 2);
        HotelBookingSystems booking3 = new HotelBookingSystems(booking2);

        // Display the details of each booking
        booking1.displayDetails();
        booking2.displayDetails();
        booking3.displayDetails();
    }

}
