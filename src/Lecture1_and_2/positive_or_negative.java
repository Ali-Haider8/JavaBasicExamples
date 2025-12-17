package Lecture1_and_2;

import java.util.Scanner;

public class positive_or_negative {
    public static void main(String[] args) {
        int n;
        String result;


        System.out.println("Cal. Check positive or negative");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        n = input.nextInt();

        if (n == 0) {
            result = "zero!";
        } else if (n > 0) {
            result = "positive";
        } else {
            result = "negative";
        }

        System.out.println("The result is: " + result);

        System.out.println("---------------");
    }
}

