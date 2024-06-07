package Method;

public class test {
	public static void main(String[] args) {
		int s = getSumOf1to100();
		System.out.println("Total sum="+s);
		
		int smallest = findSmallest(2,3);
		System.out.println("smallest number is"+smallest);
		
	}
	static //3. return type with no arguments
	int getSumOf1to100() {
		int s = 0;
		 
		for (int i =1; i<=100; i++) {
			s = s + i;
			
		}
		return s;
	}
	
	//4. return type with arguments
	static int findSmallest(int a, int b)
	{
		if(a<b) {
			return b;
	}
	 else{
		return a;
	}
	

	}
}
