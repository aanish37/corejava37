package controlstatement;

public class EvenOddsum {
	public static void main(String[] args) {
		int es = 0;
		int os = 0;
		for( int i=1; i<=100; i++) {
			if(i%2 == 0) {
				es = es + i;
			}else {
				os = os + i;
			}
		}
		System.out.println("sum of evens =" +es);
		System.out.println("sum of odds =" +os);
		System.out.println("--------");
		System.out.println("total sum=" +(es+os));
		
	}

}
