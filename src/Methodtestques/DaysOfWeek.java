package Methodtestques;

import java.util.Scanner;

public class DaysOfWeek {

    
    public static String getDayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid number! Please enter a number between 1 and 7.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number (1...7) to get the corresponding day of the week: ");
        int dayNumber = sc.nextInt();

        
        String dayName = getDayName(dayNumber);
        System.out.println(dayName);
    }
}
