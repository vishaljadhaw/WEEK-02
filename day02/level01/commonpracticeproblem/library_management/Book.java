package day02.level01.commonpracticeproblem.library_management;

public class Book {
    public static void main(String[] args) {
        // Create an instance of the BookLibrarySystem class
        BookLibrarySystem book = new BookLibrarySystem("Harry Potter", "J.K. Rowling", 20.0);

        // Display book details
        book.displayBookDetails();

        // Borrow the book
        book.borrowBook();

        // Try to borrow the book again
        book.borrowBook();

        // Return the book
        book.returnBook();

        // Display book details after returning
        book.displayBookDetails();
    }

}
