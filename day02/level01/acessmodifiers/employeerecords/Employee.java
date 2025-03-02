package day02.level01.acessmodifiers.employeerecords;

public class Employee {
    public static void main(String[] args) {
        // Create an instance of Manager
        Manager manager = new Manager(123, "IT", 12345.67);
        manager.displayDetails();
        manager.modifySalary(15000.00);
        System.out.println("After salary modification: ");
        manager.displayDetails();
    }

}
