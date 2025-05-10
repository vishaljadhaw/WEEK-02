package day04.level01.schoolresultapplication;

public class GradeCalculator {
    // Method to calculate the total marks of a student
    public int calculateTotalScore(Student student) {
        int total = 0;
        for (Subject subject : student.getSubjects()) {
            total += subject.getSubjectScore();
        }
        return total;
    }

    // Method to calculate the average score
    public double calculateAverageScore(Student student) {
        int total = calculateTotalScore(student);
        int subjectCount = student.getSubjects().size();
        return subjectCount > 0 ? (double) total / subjectCount : 0;
    }

    // Method to determine grade based on average score
    public String calculateGrade(Student student) {
        double average = calculateAverageScore(student);
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

}
