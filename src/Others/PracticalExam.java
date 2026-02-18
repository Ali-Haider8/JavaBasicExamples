package Others;

import java.util.Scanner;

public class PracticalExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = input.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("The Factorial of " + n + " is: " + fact);

    }
}
