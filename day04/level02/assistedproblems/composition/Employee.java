package day04.level02.assistedproblems.composition;

public class Employee {
    private String employeeName;
    private String employeeId;

    // Constructor
    Employee(String employeeName, String employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    // Get employee name
    public String getEmployeeName() {
        return employeeName;
    }

    // Get employee ID
    public String getEmployeeId() {
        return employeeId;
    }

}
