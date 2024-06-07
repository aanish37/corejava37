package controlstatement;

public class DowhileLoop {
	/*
	 * --------------do-while loop------------------
	 * 
	 * syntax :
	 *     do{
	 *     
	 *     //statements
	 *     
	 *     }while(condition);
	 */
	public static void main(String[] args) {
		/*
		 * 9 x 1 = 9
		 * 9 x 2 = 18
		 * ----------
		 * ----------
		 * 9 x 10 = 90
		 */
		int n = 9;
		int i = 1;
		do {
			System.out.println(n+"x"+i+"="+(n*1));
			i++;
		}while(i<=10);
	}

}
