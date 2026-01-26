package Lecture8.HW;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = input.nextInt();
        System.out.print("Enter a power: ");
        int power = input.nextInt();
        input.close();

        int result = 1;
        for (int i = 0; i < power; i++)
            result = result * base;

        System.out.println("The result is: " + result);

    }
}
