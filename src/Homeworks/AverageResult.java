package Homeworks;

import java.util.Scanner;

public class AverageResult {

    static double readMark(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid Input!");
                sc.next();
                continue;
            }

            double mark = sc.nextDouble();

            // Range check 0..100
            if (mark >= 0 && mark <= 100)
                return mark;
            else
                System.out.println("Invalid mark!");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double mark1 = readMark(sc, "Enter Mark 1 (0-100): ");
        double mark2 = readMark(sc, "Enter Mark 2 (0-100): ");

        double avg = (mark1 + mark2) / 2;

        System.out.println("Average: " + avg);
        if (avg >= 50)
            System.out.println("Passed");
        else
            System.out.println("Failed");

        sc.close();

    }
}