package Lecture2;

import java.util.Scanner;

public class largest_among_two_numbers {

    public static void main(String[] args) {
        int x, y;
        String result;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer value for x: ");
        x = input.nextInt();
        System.out.print("Enter a integer value for y: ");
        y = input.nextInt();


        if (x != y) {
            if (x > y) {
                result = "x";
            } else {
                result = "y";
            }
            System.out.println("The largest number is: " + result);
        } else {
            System.out.println("Both numbers are equal");
        }

    }
}
