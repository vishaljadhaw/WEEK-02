package day02.level01.instanceclass.onlinecoursemanagement;

public class Course {
    public static void main(String[] args) {
        // Set the institute name
        CourseManagement.updateInstituteName("RGPV Institute");
        // Create an instance of CourseManagement
        CourseManagement course1 = new CourseManagement("Python Programming", 6, 5000);
        CourseManagement course2 = new CourseManagement("Data Science", 9, 8000);

        // Display course details
        System.out.println("Course details before institute name update: ");
        System.out.println();
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update institute name
        CourseManagement.updateInstituteName("Technocrats Institute of Technology");

        // Display course details after institute name update
        System.out.println("Course details after institute name update: ");
        System.out.println();
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }

}
