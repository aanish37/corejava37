package controlstatement;

import java.util.Scanner;

public class IfTest {
/*
 * -----------------if------------------
 * # syntax:
 * if(condition){
 *  
 *  	int salary = 80000;
 *      if(salary<40000) {
			salary = salary + 5000;
		}
		salary = salary + 5000;
		System.out.println("Your salary = "+salary);
		
		// 
 *         
 * }
 *         
 */
	
	public static void main(String[] args) {
		int salary;
		// get data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary");
		salary = sc.nextInt();
		if(salary<40000) {
			salary = salary + 5000;
		}
		System.out.println("Your salary = "+salary);
		
	}
}
