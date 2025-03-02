package day04.level02.assistedproblems.composition;
import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor
    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        this.departments.add(department);
    }
    public ArrayList<Department> getDepartments() {
        return departments;
    }


    // Method to remove a department
    public void removeDepartment(String departmentName) {
        departments.removeIf(department -> department.getDepartmentName().equals(departmentName));
    }

    // Method to display all departments and employees
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            System.out.println("  Department: " + department.getDepartmentName());
            department.displayEmployees();
        }
    }

    // Delete all departments and employees
    public void deleteCompany() {
        departments.clear();
        System.out.println("Company and departments are deleted.");
    }

}
