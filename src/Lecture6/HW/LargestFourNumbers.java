package Lecture6.HW;

import java.util.Scanner;

public class LargestFourNumbers {

    @SuppressWarnings("DuplicatedCode")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = input.nextInt();

        System.out.print("Enter n2: ");
        int n2 = input.nextInt();

        System.out.print("Enter n3: ");
        int n3 = input.nextInt();

        System.out.print("Enter n4: ");
        int n4 = input.nextInt();

        input.close();

        int max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;
        if (n4 > max) max = n4;

        System.out.println("The Largest number is: " + max);

    }
}
