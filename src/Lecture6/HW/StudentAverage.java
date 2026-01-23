package Lecture6.HW;

import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter average (integer): ");
        int average = input.nextInt();
        input.close();

        String result = null;
        if (average > 100 || average < 0) result = "Out of Range";
        if (average >= 0 && average < 50) result = "Fail";
        if (average >= 50 && average < 59) result = "Accepted";
        if (average >= 60 && average < 69) result = "Medium";
        if (average >= 70 && average < 79) result = "Good";
        if (average >= 80 && average < 89) result = "Very Good";
        if (average >= 90 && average <= 100) result = "Excellent";

        System.out.println("The average is " + result);
    }
}
