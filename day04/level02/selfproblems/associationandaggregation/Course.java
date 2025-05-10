package day04.level02.selfproblems.associationandaggregation;
import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    // Course class Attributes
    private String courseName;
    private ArrayList<Student> studentEnrolledCourse;

    // Constructor
    public Course(String courseName){
        this.courseName = courseName;
        this.studentEnrolledCourse = new ArrayList<>();
    }
    // Method to return the course name
    public String getCourseName(){
        return courseName;
    }
    // Add a student to the course
    public void addStudent(Student student) {
        if (!studentEnrolledCourse.contains(student)) {
            studentEnrolledCourse.add(student);
        }
    }

    // Show all students enrolled in the course
    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        System.out.println("  Enrolled Students:");
        for (Student student : studentEnrolledCourse) {
            System.out.println("    - " + student.getStudentName());
        }
    }

}
