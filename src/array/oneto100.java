package array;

public class oneto100 {
	public static void main(String[] args) {
		getOddnums();
		
	}

   /*
    *  public static void main(String[] args) {
        int[] oddNumbers = filterOddNumbers(1, 100);
        printArray(oddNumbers);
    }

    // Method to filter odd numbers and store in an array
    public static int[] filterOddNumbers(int start, int end) {
        // Calculate the size of the array needed
        int size = (end - start) / 2 + 1;
        int[] oddNumbers = new int[size];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                oddNumbers[index++] = i;
            }
        }
        return oddNumbers;
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    */
	 static void getOddnums() {
		 int[] oddnums = new int[50];
		 int j = 0;
		 
		 for(int i = 1; i<=100; i++) {
			 if(i%2 != 0) {
				 oddnums[j] = i;
				 j++;
			 }
			 for(int x : oddnums) {
				 System.out.println(x);
			 }
		 }
	 }
}
