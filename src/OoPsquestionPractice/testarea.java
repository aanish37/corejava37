package OoPsquestionPractice;

import java.util.Scanner;

public class testarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area rectangle = new Area();

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        rectangle.setDim(length, breadth);

        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
 
}
