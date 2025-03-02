package day04.level02.selfproblems.associationandaggregation;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    // School class Attributes
    private String schoolName;
    private ArrayList<Student>students;

    // Constructor
    public School(String schoolName){
        this.schoolName=schoolName;
        this.students=new ArrayList<>();
    }

    // Add student in Students arrayList
    public void addStudent(Student newStudent){
        students.add(newStudent);
    }

    // Display details of all students in School
    public void displayStudentsDetails(){
        System.out.println("School name: " + schoolName);
        for(Student student : students){
            System.out.println("Student name: " + student.getStudentName());
        }
    }

}
