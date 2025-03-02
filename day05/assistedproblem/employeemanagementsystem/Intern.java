package day05.assistedproblem.employeemanagementsystem;

public class Intern extends Employee {
    private String schoolName;

    // Constructor
    public Intern( String schoolName, String name, int id, double salary){
        super(name, id, salary);
        this.schoolName = schoolName;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Intern School name: " + schoolName);

    }


}
