package day02.level01.commonpracticeproblem.library_management;

public class BookLibrarySystem {
    // Declare the attributes
    private String title;
    private String author;
    private double price;
    private String availability;

    // Constructor to initialize the attributes
    public BookLibrarySystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = "Available";
    }

    // Getter and setter methods for the attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (this.availability.equals("Available")) {
            this.availability = "Borrowed";
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (this.availability.equals("Borrowed")) {
            this.availability = "Available";
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + availability);
    }
}


