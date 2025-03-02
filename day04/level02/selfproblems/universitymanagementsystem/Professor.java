package day04.level02.selfproblems.universitymanagementsystem;

public class Professor {
    private String name;
    private String department;

    // Constructor
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    public String toString() {
        return name + " (" + department + ")";
    }
}
