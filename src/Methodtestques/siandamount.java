package Methodtestques;

import java.util.Scanner;

public class siandamount {
	public static void main(String[] args) {
		input();
	}
	static void input() {
		int p;
		int t;
		int r;
		Scanner sc = new Scanner(System.in);
		p=sc.nextInt();
		t=sc.nextInt();
		r=sc.nextInt();
		processing(p,t,r);
		
		
		
		
	}
	
	static void processing(int p, int t, int r) {
		int si=(p*t*r)/100;
		int amt= p + si;
		output(si, amt);
		
	}
	
	static void output(int si, int amt) {
		System.out.println(si);
		System.out.println(amt);
		
	}

}
