package Lecture6.HW;

import java.util.Scanner;

public class SummationFourNumbers {

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

        int sum = n1 + n2 + n3 + n4;
        System.out.println("The sum is: " + sum);

    }
}