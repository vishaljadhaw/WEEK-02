package day04.level02.selfproblems.universitymanagementsystem;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.professor = null;  // Initially, no professor assigned
        this.students = new ArrayList<>();
    }

    // Assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getStudents() {
        return students;
    }
    public String toString() {
        StringBuilder courseDetails = new StringBuilder();
        courseDetails.append("Course: ").append(courseName).append("\n")
                .append("Professor: ").append(professor != null ? professor.getName() : "Not Assigned").append("\n")
                .append("Enrolled Students: \n");

        if (students.isEmpty()) {
            courseDetails.append("  No students enrolled.\n");
        } else {
            for (Student student : students) {
                courseDetails.append("  - ").append(student.getName()).append("\n");
            }
        }
        return courseDetails.toString();
    }

}
