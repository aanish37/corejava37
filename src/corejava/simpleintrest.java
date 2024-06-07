package corejava;

public class simpleintrest {
	public static void main(String[] args) {
		
	    double principal = 1000.0; 
	    double annualInterestRate = 5.0; 
	    int time = 3; 
	    double simpleInterest = (principal * annualInterestRate * time) / 100;
	    System.out.println("The principal amount is: " + principal);
	    System.out.println("The annual interest rate is: " + annualInterestRate + "%");
	    System.out.println("The time period is: " + time + " years");
	    System.out.println("The simple interest is: " + simpleInterest);
		
		
	}
}
