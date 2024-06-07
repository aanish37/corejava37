package OoPsquestionPractice;

public class Rectangle {
    // Properties
    double length;
    double width;

    // Methods
    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    void printRectangleInfo() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }
}