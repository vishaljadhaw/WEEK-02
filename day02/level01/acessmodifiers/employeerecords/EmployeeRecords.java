package day02.level01.acessmodifiers.employeerecords;

public class EmployeeRecords {
    // Declare attributes
    public int employeeID;
    protected String department;
    private double salary;

    // Parameterized constructor to initialize attributes
    public EmployeeRecords(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }
    // Public method to get salary
    public double getSalary() {
        return salary;
    }

}
