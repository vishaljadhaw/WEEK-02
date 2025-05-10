package day04.level02.selfproblems.universitymanagementsystem;

public class Student {
    private String name;
    private int rollNumber;

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Enroll the student in a course
    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
    public String toString() {
        return name + " (Roll Number: " + rollNumber + ")";
    }

}
