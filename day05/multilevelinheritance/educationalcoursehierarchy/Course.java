package day05.multilevelinheritance.educationalcoursehierarchy;

public class Course {
    // Attributes
    private String courseName;
    private int duration;

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Display the course information
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName + "\n  Duration: " + duration + " hours");
    }

}
