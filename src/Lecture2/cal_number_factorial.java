package Lecture2;

import java.util.Scanner;

public class cal_number_factorial {
    public static void main(String[] args) {
        int n, f;
        String result;

        System.out.println("Cal. Find factorial for a integer number");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        n = input.nextInt();

        f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        result = "!" + n + " = " + f;
        System.out.println(result);

        System.out.println("---------------");
    }
}
