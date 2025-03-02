package day02.level01.acessmodifiers.universitymanagementsystem;

public class UniversityManagementSystem {
    // Declare the attributes
    public String rollNumber;
    protected String name;
    private double CGPA;

    // Parameterized constructor to initialize the attributes
    public UniversityManagementSystem(String rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter and setter methods
    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }
    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }


}
