package day04.level02.assistedproblems.composition;
import java.util.ArrayList;
public class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor
    Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Get department name
    public String getDepartmentName() {
        return departmentName;
    }

    // Add an employee to the department
    public void addEmployee(String employeeName, String employeeId) {
        Employee employee = new Employee(employeeName, employeeId);
        this.employees.add(employee);
    }

    // Display detail of all employees in the department
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("    Employee: " + employee.getEmployeeName() + " (ID: " + employee.getEmployeeId() + ")");
        }
    }

}
