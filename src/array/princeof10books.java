package array;

import java.util.Scanner;

public class princeof10books {
	public static void main(String[] args) {
		int book[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++) {
			System.out.println("Enter price of book");
			
			book[i] = sc.nextInt();	
		}
		for(int x : book) {
			System.out.println(x);
		}
	}
}
