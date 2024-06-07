package array;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] evenNumbers = new int[50];
        int index = 0;

        for (int i = 2; i <= 100; i += 2) {
            evenNumbers[index++] = i;
        }

        System.out.println("Even numbers from 1 to 100 are:");
        for (int num : evenNumbers) {
            System.out.println(num);
        }
    }
}
