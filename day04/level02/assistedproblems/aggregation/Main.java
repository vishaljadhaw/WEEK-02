package day04.level02.assistedproblems.aggregation;

public class Main {
    public static void main(String[] args) {

        // create the Book class object and call constructor
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create library object and constructor to store library names
        Library library1 = new Library("City Library");
        Library library2 = new Library("Central Library");
        Library library3 = new Library("CG Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2); // The same book can exist in multiple libraries
        library2.addBook(book3);
        library3.addBook(book3);
        library3.addBook(book1);
        library3.addBook(book2);

        // Display books in each library
        library1.displayBooksDetails();
        library2.displayBooksDetails();
        library3.displayBooksDetails();
    }

}
