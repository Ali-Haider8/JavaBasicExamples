package Lecture1_and_2;

import java.util.Scanner;

public class cal_the_value_of_w_of_x {
    public static void main(String[] args) {
        double x;
        double w;
        Scanner input = new Scanner(System.in);
        System.out.println("W(X) = X³ + Cos(3X) If: X > 0");
        System.out.println("W(X) = 3X² + X If: X <= 0");

        System.out.print("Enter a integer value for X: ");
        x = input.nextInt();

        if (x > 0)
            w = (x * x * x) + Math.cos(3 * x);
        else
            w = 3 * (x * x) + x;

        System.out.println("W(X) = " + w);


    }
}
