package Methodtestques;

import java.util.Scanner;

public class sumofnaturalnumber {

  
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number to sum natural numbers up to that number: ");
        int n = sc.nextInt();

        int sum = sumNaturalNumbers(n);
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
    }
}
