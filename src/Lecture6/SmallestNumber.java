package Lecture6;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
//        int x = 20;
//        int y = 10;

        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        x = input.nextInt();
        System.out.println("Enter a number");
        y = input.nextInt();

        if (x == y)
            System.out.println("The Both of numbers are equals");
        else if (x < y)
            System.out.println("The smallest number is: " + x);
        else
            System.out.println("The smallest number is: " + y);
    }
}
