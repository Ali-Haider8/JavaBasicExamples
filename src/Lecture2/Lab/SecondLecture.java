package Lecture2.Lab;

import java.util.Scanner;

public class SecondLecture {
    public static void main(String[] args) {
        // variables
        int x, y;
        double z;

        System.out.println("Lecture 2, java program");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        x = input.nextInt();
        System.out.print("Enter the second integer number: ");
        y = input.nextInt();
        System.out.println("The first number is: " + x);
        System.out.println("The second number is: " + y);

        System.out.println("---------------");

        System.out.println("The sum of x, y is: " + (x + y));

        System.out.println("---------------");

        System.out.println("Find the bigger number between 2 integers");
        System.out.print("Enter the first integer: ");
        x = input.nextInt();
        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        if (x == y)
            System.out.println("X and Y are equal");
        else if (x > y)
            System.out.println(x + " is bigger then " + y);
        else
            System.out.println(y + " is larger then " + x);

        System.out.println("---------------");
        System.out.println("Check if the number is positive or negative");
        System.out.print("Enter A integer value: ");
        x = input.nextInt();
        if (x == 0)
            System.out.println(x + " is equal to 0");
        else if (x > 0)
            System.out.println(x + " is positive");
        else
            System.out.println(x + " is negative");

        System.out.println("---------------");
        System.out.println("Calculate the sum of Y=X²+6X+9");
        System.out.print("Enter a integer value of x: ");
        x = input.nextInt();
        y = (x * x) + (6 * x) + (9);
        System.out.println("The result is: " + y);

        System.out.println("---------------");
        System.out.println("Calculate the area of a triangle");
        System.out.print("Enter a integer value for base: ");
        x = input.nextInt();
        System.out.print("Enter a integer value for height: ");
        y = input.nextInt();

        z = (0.5) * x * y;
        System.out.println("The area of a triangle is: " + z);

        System.out.println("---------------");
        System.out.println("Check the number is odd or even");
        System.out.print("Enter A integer value of x: ");
        x = input.nextInt();
        if (x % 2 == 0)
            System.out.println(x + " is even");
        else
            System.out.println(x + " is odd");

    }
}
