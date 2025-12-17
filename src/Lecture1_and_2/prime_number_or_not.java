package Lecture1_and_2;

import java.util.Scanner;

public class prime_number_or_not {
    public static void main(String[] args) {
        int n;
        int flag = 0;

        System.out.println("Cal. check the number is prime or not");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        n = input.nextInt();

        if (n == 1)
            System.out.println("The number is not prime");
        else if (n == 2)
            System.out.println("The number is prime");
        else {
            for (int i = 2; i < n; i++)
                if (n % i == 0) {
                    flag = 1;
                    break;
                }

            if (flag == 1)
                System.out.println("The number is not prime");
            else
                System.out.println("The number is prime");

        }
    }
}
