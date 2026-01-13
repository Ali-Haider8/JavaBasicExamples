package Lecture6;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer value for a: ");
        a = input.nextInt();
        System.out.print("Please enter an integer value for b: ");
        b = input.nextInt();
        System.out.print("Please enter an integer value for c: ");
        c = input.nextInt();

        System.out.println("\n" + "A: " + a + "\nB: " + b + "\nC: " + c);

        /*if (a >= b)
            if (a >= c)
                System.out.println("The Largest number is: " + a);
            else
                System.out.println("The Largest number is: " + c);
        else if (b >= c)
            System.out.println("The Largest number is: " + b);
        else
            System.out.println("The Largest number is: " + c);*/


        System.out.println("a >= b ?");
        if (a >= b) {
            System.out.println("Yes");
            System.out.println();
            System.out.println("a >= c ?");
            if (a >= c) {
                System.out.println("Yes");
                System.out.println(":. The largest number is: " + a);
            } else {
                System.out.println("No");
                System.out.println(":. The largest number is: " + c);
            }
        } else if (b >= c) {
            System.out.println("No");
            System.out.println(":. The largest number is: " + b);
        } else
            System.out.println(":. The largest number is: " + c);

    }
}