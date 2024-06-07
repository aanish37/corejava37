package array;

import java.util.Scanner;

public class Cities6 {
    public static void main(String[] args) {
        String[] cities = new String[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the name of city " + (i + 1) + ": ");
            cities[i] = sc.nextLine();
        }

        sc.close();

        System.out.println("The names of the cities are:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
