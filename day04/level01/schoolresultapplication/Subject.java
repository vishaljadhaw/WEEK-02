package day04.level01.schoolresultapplication;

public class Subject {
    private String subjectName;
    private int subjectScore;

    // Constructor
    public Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    // Get subject Name
    public String getSubjectName() {
        return subjectName;
    }

    // Get score for the subject
    public int getSubjectScore() {
        return subjectScore;
    }

}
