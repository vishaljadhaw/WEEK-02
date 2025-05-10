package day04.level02.selfproblems.compositionandagreegation;

public class Main {
    public static void main(String[] args) {
        // Create a university class object
        University university = new University("RGPV University");

        // Add departments to the university
        university.addDepartment("Computer Science Engg.");
        university.addDepartment("Mechanical Engineering");
        university.addDepartment("Physics");

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Rajendra", "F001");
        Faculty faculty2 = new Faculty("Prof. Arjun", "F002");

        // Add faculty members to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display university details
        university.displayUniversityDetails();

        // Demonstrate deletion of the university
        university.deleteUniversity();

        // Show that faculty members still exist independently
        System.out.println("Faculty members still exist:");
        System.out.println("  - " + faculty1.getName());
        System.out.println("  - " + faculty2.getName());
    }

}
