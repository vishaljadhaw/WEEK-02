package day04.level02.selfproblems.associationandaggregation;


public class Main {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Saraswati High School");

        // Create students
        Student student1 = new Student("DK", 101);
        Student student2 = new Student("K.K. Patel", 102);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Enroll students in courses
        student1.studentEnrollCourse(course1);
        student1.studentEnrollCourse(course2);
        student2.studentEnrollCourse(course2);
        student2.studentEnrollCourse(course3);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Display school details
        school.displayStudentsDetails();

        // Display student courses
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        // Display course details
        course1.showEnrolledStudents();
        course2.showEnrolledStudents();
        course3.showEnrolledStudents();
    }

}
