package day03.level01.librarymanagementsystem;

public class LibraryMangementSystem {
    // Attributes of the class
    static String libraryName= "Central Library";
    String title;
    String author;
    final int isbn;


    // Constructor of the class
    public LibraryMangementSystem(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }
    static void displayLibraryName(){
        System.out.println("Library Name: " + libraryName);
    }
    // Method to display the details of the book
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }


}
