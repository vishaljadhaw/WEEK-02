package day05.assistedproblem.animalhierarchy;

public class Bird extends Animal {
    // Constructor
    public Bird(String name, int age) {
        super(name, age);
    }

    // Method Overrinding
    @Override
    void makeSound() {
        System.out.println("Bird is sounded");
    }
}

