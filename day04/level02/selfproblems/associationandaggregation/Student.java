package day04.level02.selfproblems.associationandaggregation;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    // Student class Attributes
    private String studentName;
    private int studentId;
    private ArrayList<Course>studentEnrollCourses;

    // Constructor
    public Student(String studentName, int studentId){
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentEnrollCourses = new ArrayList<>();
    }
    // Method to return the student name
    public String getStudentName(){
        return studentName;
    }
    // Enroll the student in a course
    public void studentEnrollCourse(Course course) {
        if (!studentEnrollCourses.contains(course)) {
            studentEnrollCourses.add(course);
            course.addStudent(this);
        }
    }

    // View the courses the student is enrolled in
    public void viewEnrolledCourses() {
        System.out.println("Student: " + studentName + " (ID: " + studentId + ")");
        System.out.println("  Enrolled Courses:");
        for (Course course : studentEnrollCourses) {
            System.out.println("    - " + course.getCourseName());
        }
    }

}
