package day02.level01.acessmodifiers.LibraryManagement;

public class Book {
    public static void main(String[] args) {
        // Create an instance of EBook
        EBook ebook = new EBook(12345, "Introduction to Java", "John Do java");
        ebook.displayDetails();
        // Accessing author from superclass
        System.out.println("Author: " + ebook.getAuthor());

    }

}
