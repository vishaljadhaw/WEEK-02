package day03.level01.universitystudentmanagement;

public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Display the university name
        System.out.println("University Name: " + Student.universityName);

        // Create student instances
        Student student1 = new Student("Alice", "S101", "A");
        Student student2 = new Student("Bob", "S102", "B");

        // Display total students
        Student.displayTotalStudents();

        // Display student details
        System.out.println("\nStudent 1 Details:");
        student1.displayStudentDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayStudentDetails();

        // Update student grade
        student1.updateGrade("A+");

        // Validate object instances
        System.out.println("\nValidation:");
        Student.validateObject(student1); // Should be valid
        Student.validateObject("Not a Student"); // Should not be valid
    }

}
