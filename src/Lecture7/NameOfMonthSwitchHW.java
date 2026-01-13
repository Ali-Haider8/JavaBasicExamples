package Lecture7;

import java.util.Scanner;

public class NameOfMonthSwitchHW {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month number in the year: ");
        int month = input.nextInt();
        input.close();

        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };

        System.out.println("The name of the month is: " + monthName);

    }
}