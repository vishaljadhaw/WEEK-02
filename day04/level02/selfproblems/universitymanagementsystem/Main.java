package day04.level02.selfproblems.universitymanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Creating professors
        Professor professor1 = new Professor("Dr. Ramesh Kumar", "Computer Science");
        Professor professor2 = new Professor("Dr. Sunita Gupta", "Mathematics");

        // Creating courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Discrete Mathematics");

        // Assigning professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Creating students
        Student student1 = new Student("Amit Singh", 101);
        Student student2 = new Student("Priya Sharma", 102);
        Student student3 = new Student("Karan Verma", 103);

        // Enrolling students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student3.enrollCourse(course2);

        // Display course details
        System.out.println(course1);
        System.out.println(course2);
    }

}
