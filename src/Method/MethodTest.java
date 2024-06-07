package Method;

public class MethodTest {
	public static void main(String[] args) {
		//add();
		//area();
		printTable(665);
		
	}
	//1. no return type with no arguments
	
  // static void add() {
	//	int x = 343;
	//	int y = 343;
		
		//int s = x + y;
		//System.out.println("sum = "+s);
	//}
   
   //static void area() {
	//   int r = 34;
	 ////  int z = (int) (Math.PI  *r*r);
	  // System.out.println("area ="+z);
  // }
   
   //2. no  return type with arguments
   
   //}z
    static void printTable(int n) {
	   for(int i=1; i<=10; i++) {
		   System.out.println(n+"x"+i+"="+(n*1));
	   }
}
}



