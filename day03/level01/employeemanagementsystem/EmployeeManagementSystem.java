package day03.level01.employeemanagementsystem;

public class EmployeeManagementSystem {
    //Attributes of the class
    public static String companyName = "Capgemini";
    public static int totalCounts=0;
    final int employeeID;
    private String employeeName;
    private String employeeDesignation;

    // Parameterized constructor to initialize attributes
    public EmployeeManagementSystem(int employeeID, String employeeName, String employeeDesignation) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        totalCounts++;
    }

    static void displayTotalEmployees(){
        System.out.println("Total employees: " + totalCounts);
    }

    void displayEmployeesDetails(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Designation: " + employeeDesignation);
        System.out.println();
    }

}
