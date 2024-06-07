package controlstatement;

public class WhileTest {
	/*
	 * ------------while loop---------------
	 * syntax :
	 *  while(condition){
	 *        //statements
	 *    }
	 */
	public static void main(String[] args) {
		// 5! = 5 x 4 x 3 x 2 = 120
		int n = 5;
		int fact = 1;
		while(n > 1) {	
			fact = fact*n;
			n--;
		}
		System.out.println("Result="+fact);
	}

}
