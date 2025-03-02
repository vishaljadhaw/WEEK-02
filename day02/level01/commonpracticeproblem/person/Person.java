package day02.level01.commonpracticeproblem.person;

public class Person {
    public static void main(String[] args) {
        // Call default constructor
        PersonDetails  p1 = new PersonDetails();
        p1.displayDetails();

        // Call parameterized constructor
        PersonDetails p2 = new PersonDetails("Sandeep", "Pune", "1234567890");
        p2.displayDetails();

        // Call copy constructor
        PersonDetails p3 = new PersonDetails(p2);
        p3.displayDetails();

    }

}
