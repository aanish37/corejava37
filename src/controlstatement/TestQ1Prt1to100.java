package controlstatement;

public class TestQ1Prt1to100 {
	 public static void main(String[] args) {
	        int sum = 0;

	        // Loop from 1 to 100
	        for (int i = 1; i <= 100; i++) {
	            // Print the current number followed by a space
	            System.out.print(i + " ");
	            // Add the current number to the sum
	            sum += i;
	        }

	        // Print a newline for better formatting
	        System.out.println();

	        // Print the total sum
	        System.out.println("Sum of numbers from 1 to 100: " + sum);
	    }


}