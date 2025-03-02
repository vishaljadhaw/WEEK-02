package day05.assistedproblem.employeemanagementsystem;

public class Manager extends Employee{
    private int teamSize;

    public Manager(int teamSize, String name, int id,double salary){
        super(name,id,salary);
        this.teamSize = teamSize;

    }
    @Override
    // Method to display team details
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team size is " + teamSize);
    }

}

