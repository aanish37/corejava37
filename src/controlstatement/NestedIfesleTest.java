package controlstatement;

public class NestedIfesleTest {
	/*
	 * --------------------------------- nested if----------------------------------------------------
	 */
	public static void main(String[] args) {
		String citizen = "nepali";
		int age = 30;
		
		
		
		if(citizen.equals(citizen)) {
			
			if(age >= 18) {
				System.out.println("You can vote !!");
			}else {
				System.out.println("You are under age !!");
				
			}
			
		}else {
			System.out.println("invalid citizenship !!");
			
		}
	}

}

