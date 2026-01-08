package Lecture2;

import java.util.Scanner;

public class find_the_biggest_from_three_number {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();
        System.out.print("Enter the third number: ");
        n3 = input.nextInt();

        if (n1 > n2 && n1 > n3)
            System.out.println("First number is greater than Second number");
        else if (n2 > n1 && n2 > n3)
            System.out.println("Second number is greater than Third number");
        else if (n3 > n1 && n3 > n2)
            System.out.println("Third number is greater than First number");
        else
            System.out.println("Please recheck your entries");
    }
}
