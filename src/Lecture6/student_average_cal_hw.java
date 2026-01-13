package Lecture6;

import java.util.Scanner;

public class student_average_cal_hw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float student_average;
        String msg;

        System.out.print("Enter student average: ");
        student_average = input.nextFloat();
        input.close();

        if (student_average < 0 || student_average > 100)
            msg = "Out of Range";
        else if (student_average >= 0 && student_average < 45)
            msg = "Fail";
        else if (student_average > 45 && student_average < 50)
            msg = "Passed by carve";
        else if (student_average >= 50 && student_average < 60)
            msg = "Accepted";
        else if (student_average >= 60 && student_average < 70)
            msg = "Medium";
        else if (student_average >= 70 && student_average < 80)
            msg = "Good";
        else if (student_average >= 80 && student_average < 90)
            msg = "Very Good";
        else if (student_average >= 90)
            msg = "Excellent";
        else
            msg = "Invalid Input";

        System.out.println("The Result of Your Average is: " + msg);
    }

}