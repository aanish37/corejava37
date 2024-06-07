package array;

public class OddNumbers {
    public static void main(String[] args) {
        int[] oddNumbers = new int[50];
        int index = 0;

        for (int i = 1; i <= 100; i += 2) {
            oddNumbers[index++] = i;
        }

        System.out.println("Odd numbers from 1 to 100 are:");
        for (int num : oddNumbers) {
            System.out.println(num);
        }
    }
}
