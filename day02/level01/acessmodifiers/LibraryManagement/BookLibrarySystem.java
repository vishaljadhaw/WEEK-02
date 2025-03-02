package day02.level01.acessmodifiers.LibraryManagement;

public class BookLibrarySystem {
    // Declare a attributes
    public int ISBN;
    protected String title;
    private String author;

    // Parameterized constructor
    public BookLibrarySystem(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


}
