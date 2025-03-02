package day02.level01.commonpracticeproblem.circlecalculation;
public class Circle {
    // Declare the attribute
    double radius;
    // Default constructor
    Circle(){
        this.radius=4.25;
    }
    // Parameterized constructor
    Circle(double radius){
        this.radius=radius;

    }
    // Method to get the radius of the circle
    double getRadius(){
        return this.radius;
    }
    // Method to set the radius of the circle
    void setRadius(double radius){
        this.radius=radius;
    }
    // Method to calculate the area of the circle
    double getArea(double radius){
        return 3.14*radius*radius;
    }


    // Method to display the area
    void displayDetails(){
        System.out.println("The radius of the circle is: "+radius);
        System.out.println("The area of the circle is: "+getArea(radius));
    }

}
