package Lecture9;

import java.util.Scanner;

public class WhileLoopFactorial {

    public static void main(String[] args) {
        int i = 1, fact = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x  = input.nextInt();

        while (i <= x) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of X is: " + fact);

    }
}
