package day02.level01.acessmodifiers.employeerecords;

public class Manager extends EmployeeRecords{
    // Access employeeID and department using public and protected access specifiers
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Public method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println();
    }

}
