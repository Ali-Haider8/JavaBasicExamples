package Lecture2;

import java.util.Scanner;

public class summation_two_numbers {

    public static void main(String[] args) {
        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.println("Cal. to find avg for 10 nums.");
        System.out.println("---------------");

        System.out.print("Enter the first number: ");
        x = input.nextInt();

        System.out.print("Enter the second number: ");
        y = input.nextInt();

        System.out.print("The sum is: " + (x + y));
    }

}
