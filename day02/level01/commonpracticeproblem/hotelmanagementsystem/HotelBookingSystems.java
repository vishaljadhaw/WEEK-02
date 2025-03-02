package day02.level01.commonpracticeproblem.hotelmanagementsystem;

public class HotelBookingSystems {
    // Declare a attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBookingSystems() {
        this.guestName = "bipin";
        this.roomType = "Luxury Room";
        this.nights = 3;
    }

    // Parameterized constructor
    public HotelBookingSystems(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBookingSystems(HotelBookingSystems other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getter and setter methods
    public String getGuestName() {
        return guestName;
    }
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public int getNights() {
        return nights;
    }
    public void setNights(int nights) {
        this.nights = nights;
    }

    // Display the Hotel Booking Systems details
    public void displayDetails() {
        System.out.println("Guest Name: " + this.guestName);
        System.out.println("Room Type: " + this.roomType);
        System.out.println("nights: " + this.nights);
    }

}
