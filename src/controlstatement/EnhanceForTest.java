package controlstatement;

public class EnhanceForTest {
	/*
	 * --------------forEach loop--------------------
	 * # use to read data from collection(array, list,set, map etc)
	 *  for( data_type var : collection){
	 *         //statements
	 *  }
	 *  
	 */
	public static void main(String[] args) {
		
		int[] values = { 7, 8, 12, 13, 14, 15, 17, 23, 24, 25, 27, 34, 35, 38};
		int s =0;
		for(int x : values) {
			System.out.println(x);
			s = s + x;
		}
		System.out.println("Sum="+s);
		
		
	}

}
