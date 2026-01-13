package Lecture6;

import java.util.Scanner;

public class LargestNumber3 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter The First Number: ");
        a = input.nextInt();
        System.out.println("Enter The Second Number: ");
        b = input.nextInt();
        System.out.println("Enter The Third Number: ");
        c = input.nextInt();

        if (a >= b && a >= c)
            System.out.println("The Largest Number is: " + a);
        else if (b >= a && b >= c)
            System.out.println("The Largest Number is: " + b);
        else
            System.out.println("The Largest Number is: " + c);
    }
}
