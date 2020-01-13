package app;
import java.util.Scanner;

public class Circle {



public void getArea() {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter radius: ");
    double radius = input.nextDouble();
    double area = Math.PI * (radius*radius);
    System.out.println("Area of circle is: " + area);
}      



    }   