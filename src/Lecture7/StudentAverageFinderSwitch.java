package Lecture7;

import java.util.Scanner;

public class StudentAverageFinderSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Average: ");
        int student_average = input.nextInt();
        input.close();

        if (student_average < 0 || student_average > 100) {
            System.out.println("Out of Range");
            return;
        }

        String result = switch (student_average / 10) {
            case 10 -> "Excellent";
            case 9 -> "Excellent";
            case 8 -> "Very Good";
            case 7 -> "Good";
            case 6 -> "Medium";
            case 5 -> "Accepted";
            default -> "Fail";
        };

        System.out.println("The Average is " + result);
    }
}