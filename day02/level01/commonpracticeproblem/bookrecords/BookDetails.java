package day02.level01.commonpracticeproblem.bookrecords;

public class BookDetails {
    // Main method
    public static void main(String [] args){
        // Create an object of Book class and call default constructor
        Book book1 = new Book();
        // Call Parameterized constructor
        Book book2 = new Book("Python", "G.V. Rossum", 999.90);
        book1.displayDetails();
        book2.displayDetails();
    }

}
