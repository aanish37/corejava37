package controlstatement;

import java.util.Scanner;

public class Q2 {
	/*
	 *  wap to find the area of circle where value of r not zero;
	 *  using scanner.
	 */
	public static void main(String[] args) {
		double r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius:");
		r = sc.nextInt();
		
		double area = 0;
		
		if(r != 0) {
			 area = Math.PI * r * r;
		}
		System.out.println("The area of the circle with radius " + r + " is: " + area);
	}
}
