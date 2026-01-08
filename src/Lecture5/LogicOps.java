package Lecture5;

import java.util.Scanner;

public class LogicOps {

    public static void main(String[] args) {

        int x, y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer for X Value: ");
        x = sc.nextInt();
        System.out.print("Enter an Integer For Y Value: ");
        y = sc.nextInt();
        sc.close();

        System.out.println("x > y || X is greater than Y : " + (x > y));
        System.out.println("x < y || X is Smaller than Y : " + (x < y));
        System.out.println("x >= y || X is greater or equal  Y :  " + (x >= y));
        System.out.println("x <= y || X is Smaller or equal Y : " + (x <= y));
        System.out.println("x == y || X is equal Y : " + (x == y));
        System.out.println("x != y || X isn't equal Y : " + (x != y));
        System.out.println("(x > 10) AND (Y > 10) is: " + ((x > 10) && (y > 10)));
        System.out.println("(x > 10) OR (Y > 10) is: " + ((x > 10) || (y > 10)));


    }
}
