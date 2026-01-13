package Lecture7;

import java.util.Scanner;

public class SwitchCaseExample1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the day:");
        int day = input.nextInt();
        String dayName;
        input.close();

        dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid input";
        };

        System.out.println(dayName);
    }
}
