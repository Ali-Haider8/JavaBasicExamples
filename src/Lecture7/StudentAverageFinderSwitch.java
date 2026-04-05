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

        String result ;
        switch (student_average / 10) {
            case 10:
            case 9:
                result= "Excellent"; break;
            case 8: result= "Very Good"; break;
            case 7: result= "Good"; break;
            case 6: result= "Medium"; break;
            case 5: result= "Accepted"; break;
            default: result= "Fail";
        };

        System.out.println("The Average is " + result);
    }
}