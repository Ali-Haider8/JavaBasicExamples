package Lecture1_and_2;

import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class smallest_three_numbers {
    public static void main(String[] args) {
        int n1, n2, n3;
        int min;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        System.out.print("Enter third number: ");
        n3 = input.nextInt();

        min = n1;

        if (n2 < min) min = n2;
        if (n3 < min) min = n3;
        System.out.println("Minimum number is " + min);

    }
}
