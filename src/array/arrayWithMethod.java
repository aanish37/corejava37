package array;

public class arrayWithMethod {
	/*
	 * ----------------Array with method----------------------
	 * 
	 * a> array as a parameter:
	 * 
	 *       void add(int x, int b, int c,...................., 50th){
	 *       
	 *       }
	 *       
	 *        void add(int a[]){
	 *       
	 *       }
	 *       
	 * b> array as return type:
	 * 
	 *      int[] getIntValue(){
	 *            int data[] = {6000, 4565, 75, 34, 45, 56, 67,45,4,5,5,4,}:
	 *            return data;
	 *         }
	 *        
	 */
	public static void main(String[] args) {
		int data[] = {54, 45, 454,45,45,45,45,45,65,565,656,5};
		sum(data);
		
		String cities[] = {"Katmandu","bkt"};
		citiess(cities);
		
		
	}
	
 //------------------------array as  parameter---------------
	
	static void sum(int values[]) {
		int s = 0;
		for(int x : values) {
			s = s + x;
			
		}
		System.out.println("Sum="+s);
	}
	
	// WAP to pass and print array of 5 cities using method 
	
	static void citiess(String values[]) {
		for(String x : values) {
			System.out.println(x);
		}
	}
	

}
