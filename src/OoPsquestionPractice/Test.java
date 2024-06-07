package OoPsquestionPractice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Car 
        Car car = new Car();
        System.out.print("Enter car brand: ");
        car.brand = sc.next();
        System.out.print("Enter car model: ");
        car.model = sc.next();
        System.out.print("Enter car year: ");
        car.year = sc.nextInt();
        System.out.print("Enter car price: ");
        car.price = sc.nextDouble();
        car.printCarInfo();
        System.out.println();

        // Student 
        Student student = new Student();
        System.out.print("Enter student name: ");
        student.name = sc.next();
        System.out.print("Enter student age: ");
        student.age = sc.nextInt();
        System.out.print("Enter student ID: ");
        student.studentID = sc.next();
        System.out.print("Enter student major: ");
        student.major = sc.next();
        student.printStudentInfo();
        System.out.println();

        // Rectangle 
        Rectangle rectangle = new Rectangle();
        System.out.print("Enter rectangle length: ");
        rectangle.length = sc.nextDouble();
        System.out.print("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();
        rectangle.printRectangleInfo();
        System.out.println();

        // Dog 
        Dog dog = new Dog();
        System.out.print("Enter dog name: ");
        dog.name = sc.next();
        System.out.print("Enter dog breed: ");
        dog.breed = sc.next();
        System.out.print("Enter dog age: ");
        dog.age = sc.nextInt();
        dog.printDogInfo();
        System.out.println();

        // Mobile 
        Mobile mobile = new Mobile();
        System.out.print("Enter mobile brand: ");
        mobile.brand = sc.next();
        System.out.print("Enter mobile model: ");
        mobile.model = sc.next();
        System.out.print("Enter mobile price: ");
        mobile.price = sc.nextDouble();
        System.out.print("Enter mobile storage: ");
        mobile.storage = sc.nextInt();
        mobile.printMobileInfo();
        System.out.println();
        
        
        

    }
}
