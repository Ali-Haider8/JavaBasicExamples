package Lecture8.HW;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                isPrime = false;
        }
        System.out.println("is " + number + " a prime number = " + isPrime);
    }
}
