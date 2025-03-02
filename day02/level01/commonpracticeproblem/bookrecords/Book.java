package day02.level01.commonpracticeproblem.bookrecords;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Java";
        this.author = "K.S. Sharma";
        this.price = 799.00;

    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display the details
    void displayDetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);

    }
}
