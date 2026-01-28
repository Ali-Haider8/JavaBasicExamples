package Lecture6.HW;

import java.util.Scanner;

public class CalculateValueOfY {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value for x: ");
        float x = input.nextInt();
        input.close();

        float y = 1 / ((x * x) - 81);
        System.out.println("The Value of Y: " + y);

    }
}
