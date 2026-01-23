package Lecture7.HW;

import java.util.Scanner;

public class StudentAverageSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter average (integer): ");
        int average = input.nextInt();
        input.close();

        // divided by 10 so get a value for each range
        // 95/10 = 9.5 = Excellent

        String result;
        switch (average / 10) {
            case 10: result = "Excellent"; break;
            case 9: result = "Excellent"; break;
            case 8: result = "Very Good"; break;
            case 7: result = "Good"; break;
            case 6: result = "Medium"; break;
            case 5: result = "Accepted"; break;
            case 4: result = "Fail"; break;
            case 3: result = "Fail"; break;
            case 2: result = "Fail"; break;
            case 1: result = "Fail"; break;
            default: result = "Out of Range";
        }

        System.out.println("The average is " + result);
    }
}
