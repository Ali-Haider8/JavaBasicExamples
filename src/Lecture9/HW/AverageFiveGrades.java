package Lecture9.HW;

import java.util.Scanner;

public class AverageFiveGrades {

    public static void main(String[] args) {
        int n = 0;
        int total_grade = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Grade " + (n + 1) + ": ");
            total_grade = total_grade + input.nextInt();
            n++;
        } while (n < 5);

        int avg_grade = total_grade / n;
        System.out.println("Number of Grades is: " + n);
        System.out.println("Total Grade is: " + total_grade);
        System.out.println("Average is: " + avg_grade);
    }
}
