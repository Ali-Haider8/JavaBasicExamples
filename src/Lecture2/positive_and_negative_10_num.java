package Lecture2;

import java.util.Scanner;

public class positive_and_negative_10_num {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter an integer number: ");
            n = input.nextInt();
            if (n == 0)
                System.out.println("Invalid input");
            else if (n > 0)
                System.out.println(n + " is positive");
            else
                System.out.println(n + " is negative");

        }

    }

}
