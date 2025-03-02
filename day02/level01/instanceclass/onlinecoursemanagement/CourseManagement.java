package day02.level01.instanceclass.onlinecoursemanagement;

public class CourseManagement {
    // Instance Variable
    String courseName;
    int duration;
    int fee;

    // Class Variable
    static String instituteName;

    // Parameterized Constructor
    CourseManagement(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method to display course details
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " Months");
        System.out.println("Fee: $" + fee);
        System.out.println();
    }

    // Class Method to update institute name
    static void updateInstituteName(String newInstituteName) {
        CourseManagement.instituteName = newInstituteName;

    }

}
