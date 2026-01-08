package Lecture2;

import java.util.Scanner;

public class find_avg_10_marks {

    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
        int sum;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.println("Cal. to find avg for 10 nums.");
        System.out.println("---------------");

        System.out.println("Enter First Number: ");
        n1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        n2 = input.nextInt();
        System.out.println("Enter Third Number: ");
        n3 = input.nextInt();
        System.out.println("Enter Fourth Number: ");
        n4 = input.nextInt();
        System.out.println("Enter Fifth Number: ");
        n5 = input.nextInt();
        System.out.println("Enter Sixth Number: ");
        n6 = input.nextInt();
        System.out.println("Enter Seventh Number: ");
        n7 = input.nextInt();
        System.out.println("Enter Eighth Number: ");
        n8 = input.nextInt();
        System.out.println("Enter Ninth Number: ");
        n9 = input.nextInt();
        System.out.println("Enter Eleventh Number: ");
        n10 = input.nextInt();

        sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
        avg = (double) sum / 10;

        System.out.println("---------------");
        System.out.println("The Avg: " + avg);

    }
}
