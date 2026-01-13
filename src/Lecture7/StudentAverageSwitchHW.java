package Lecture7;

import java.util.Scanner;

public class StudentAverageSwitchHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int student_average;
        String result = "";
        String resultMsg = "";

        System.out.print("Enter Student Average: ");
        student_average = input.nextInt();
        input.close();

        if (student_average < 0 || student_average > 100)
            result = "-";
        else if (student_average < 50)
            result = "F";
        else if (student_average < 60)
            result = "D";
        else if (student_average < 70)
            result = "C";
        else if (student_average < 80)
            result = "B";
        else if (student_average < 90)
            result = "A";
        else result = "A+";

        switch (result) {
            case "-":
                resultMsg = "Out of Range";
                break;
            case "F":
                resultMsg = "Fail";
                break;
            case "D":
                resultMsg = "Accepted";
                break;
            case "C":
                resultMsg = "Medium";
                break;
            case "B":
                resultMsg = "Good";
                break;
            case "A":
                resultMsg = "Very Good";
                break;
            case "A+":
                resultMsg = "Excellent";
                break;
            default:
                resultMsg = "Incorrect";
        }

        System.out.println("The Average is " + resultMsg);

    }
}