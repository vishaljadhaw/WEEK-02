package day02.level01.acessmodifiers.LibraryManagement;

public class EBook extends BookLibrarySystem{
    public EBook(int ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Accessing ISBN and title from superclass
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }

}
