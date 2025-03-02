package day02.level01.acessmodifiers.universitymanagementsystem;

public class Student {
    public static void main(String[] args) {
        // Create an instance of PostgraduateStudent
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent("PG001", "John Doe",3.5);

        // Call the displayPostgraduateStudentDetails method
        postgraduateStudent.displayPostgraduateStudentDetails();
    }

}
