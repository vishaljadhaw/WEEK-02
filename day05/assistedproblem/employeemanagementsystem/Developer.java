package day05.assistedproblem.employeemanagementsystem;

public class Developer extends Employee {
    private String programmingLanguage;
    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);

    }


}
