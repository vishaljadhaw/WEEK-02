package day02.level01.acessmodifiers.universitymanagementsystem;

public class PostgraduateStudent extends UniversityManagementSystem{
    // Parameterized constructor to initialize the attributes
    public PostgraduateStudent(String rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    // Public method to display postgraduate student details
    public void displayPostgraduateStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

}
