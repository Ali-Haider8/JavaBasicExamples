package Lecture2;

import java.util.Scanner;

public class enter_10_numbers_then_find_positive_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");
        for (int i = 1; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Positive Numbers: ");
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > 0)
                System.out.println(numbers[i] + " ");
        }

        System.out.println();

        System.out.println("Negative Numbers: ");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < 0)
                System.out.println(numbers[i] + " ");
        }

        input.close();
    }
}
