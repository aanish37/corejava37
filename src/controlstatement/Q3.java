package controlstatement;

import java.util.Scanner;

public class Q3 {
	/*
	 * Q3> WAP to find SI where p,t,r not zero using scanner
	 */
	public static void main(String[] args) {
		int p;
		int t;
		int r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle:");
		p = sc.nextInt();
		
		System.out.println("Enter rate:");
		r = sc.nextInt();
		
		System.out.println("Enter time:");
		t = sc.nextInt();
		
		double simpleInterest = 0;
		if(p != 0 && r != 0 && r != 0){
			simpleInterest = (p*t*r)/100;
		}
		System.out.println("The simpeleInterest is :" + simpleInterest);
	}

}
