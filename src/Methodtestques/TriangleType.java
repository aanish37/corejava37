package Methodtestques;

import java.util.Scanner;

public class TriangleType {

    public static String classifyTriangle(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilateral Triangle";
        } else if (a == b || b == c || a == c) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double c = sc.nextDouble();

        // Call the method to classify the triangle and print the result
        System.out.println("The triangle is a: " + classifyTriangle(a, b, c));
    }
}
