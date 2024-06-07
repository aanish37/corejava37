package controlstatement;

import java.util.Scanner;

public class CalculatorWithSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two integer values
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        // Prompt the user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        // Variable to store the result
        int result = 0;

        // Perform the operation based on the user input
        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    double divisionResult = (double) num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + divisionResult);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        // Close the scanner
        sc.close();
    }
}

