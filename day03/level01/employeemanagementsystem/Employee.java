package day03.level01.employeemanagementsystem;

public class Employee {
    public static void main(String[] args) {

        // Create an instance of Manager
        EmployeeManagementSystem employee1 = new EmployeeManagementSystem(01, "K.K. Patel", "Prof");
        EmployeeManagementSystem employee2 = new EmployeeManagementSystem(02, "K.S. Bharat", "Assist.Prof");

        // Use the instenceOf method to check if the object is an instance of the class

        if(employee1 instanceof EmployeeManagementSystem){
            employee1.displayEmployeesDetails();

        }
        if (employee2 instanceof EmployeeManagementSystem){
            employee2.displayEmployeesDetails();
        }

        // Method to display total number of employees
        EmployeeManagementSystem.displayTotalEmployees();



    }

}
