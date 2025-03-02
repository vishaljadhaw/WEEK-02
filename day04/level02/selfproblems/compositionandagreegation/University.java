package day04.level02.selfproblems.compositionandagreegation;
import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        this.departments.add(department);
    }

    // Add a faculty to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display university details
    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println("  - " + department.getDepartmentName());
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : faculties) {
            System.out.println("  - " + faculty.getName());
        }
    }
    // Delete the university (composition: deletes departments)
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University and all its departments have been deleted.");
    }


}
