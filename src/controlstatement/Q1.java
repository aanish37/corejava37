package controlstatement;

import java.util.Scanner;

public class Q1 {
	/*
	 *  wap to print sum of two int values where of a and b not zerp using scanner
	 *  
	 */
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		a = sc.nextInt();
		
		System.out.println("Enter number: ");
		b = sc.nextInt();
		
		int sum = 0;
		if(a != 0 && b !=0) {
			  sum = a + b;
		}
		
		System.out.println("The sum of " + a + " and " + b + " is: " + sum);
		
	}

}
