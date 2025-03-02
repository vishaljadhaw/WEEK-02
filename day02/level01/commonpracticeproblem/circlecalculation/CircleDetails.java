package day02.level01.commonpracticeproblem.circlecalculation;

import java.util.Scanner;

public class CircleDetails {
    // Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Get the radius from the user
        System.out.println("Enter the radius of the circle");
        double radius=sc.nextDouble();
        // Create an object of the Circle class
        Circle c1=new Circle();
        Circle c2=new Circle(radius);
        c1.displayDetails();
        c2.displayDetails();


        sc.close();


    }

}
