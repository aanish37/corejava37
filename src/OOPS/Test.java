package OOPS;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Math book
		Book b = new Book();
		System.out.println("Book name :");
		b.name = "sc.next";
		
		System.out.println("Book Author :");
		b.author = "sc.next";
		
		System.out.println("Book Price :");
		b.price = sc.nextInt();
		
		b.pages = 2500;
		
		b.printBookInfo();
		
		//Computer book
		
		Book c = new Book();
		
		c.name = " Cmputer";
		c.author = " Anish";
		c.price = 6000;
		c.pages = 4000;
		
		c.printBookInfo();
		
		
	}
	


}
