package day03.level01.librarymanagementsystem;

public class Book {
    public static void main(String[] args) {
        // Creating an object of the class
        LibraryMangementSystem library1 = new LibraryMangementSystem( "Harry Potter","J.K. Rowling", 123456789);
        LibraryMangementSystem library2 = new LibraryMangementSystem("The Lord of the Rings", "J.R.R. Tolkien",987654321);


        if(library1 instanceof LibraryMangementSystem){
            // Displaying the library name
            library1.displayLibraryName();
            library1.displayBookDetails();
        }
        if (library2 instanceof LibraryMangementSystem){
            library2.displayLibraryName();
            library2.displayBookDetails();
        }

    }

}
