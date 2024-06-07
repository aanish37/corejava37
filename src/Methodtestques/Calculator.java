package Methodtestques;

import java.util.Scanner;

public class Calculator {

    
    public static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2; 
            case '-':
                return num1 - num2; 
            case '*':
                return num1 * num2; 
            case '/':
                if (num2 != 0) { 
                    return num1 / num2; 
                } else {
                    System.out.println("Error! Division by zero.");
                    return 0; 
                }
            default:
                System.out.println("Invalid operator! Use +, -, *, or /.");
                return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

       
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        
        int result = calculate(num1, num2, operator);

        
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("Calculation could not be performed due to an invalid operator.");
        } else if (operator == '/' && num2 == 0) {
            System.out.println("Calculation could not be performed due to division by zero.");
        } else {
            System.out.println("Result: " + result);
        }
    }
}
