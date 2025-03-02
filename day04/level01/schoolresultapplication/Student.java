package day04.level01.schoolresultapplication;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private int studentId;
    private List<Subject> subjects;

    // Constructor
    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
    }

    // Add a subject to the student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Get the list of subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    // Get student's name
    public String getStudentName() {
        return studentName;
    }

    // Get student's ID
    public int getStudentId() {
        return studentId;
    }

}
