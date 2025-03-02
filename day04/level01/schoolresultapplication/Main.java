package day04.level01.schoolresultapplication;

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Arun", 1);

        // Add subjects and their marks
        student.addSubject(new Subject("Math", 85));
        student.addSubject(new Subject("Science", 90));
        student.addSubject(new Subject("English", 78));

        // Create a GradeCalculator
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculate and display the results
        System.out.println("Student: " + student.getStudentName());
        System.out.println("Total Marks: " + gradeCalculator.calculateTotalScore(student));
        System.out.println("Average Marks: " + gradeCalculator.calculateAverageScore(student));
        System.out.println("Grade: " + gradeCalculator.calculateGrade(student));
    }

}
