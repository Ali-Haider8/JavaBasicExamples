package Homeworks;

import java.util.Scanner;

public class AverageResult {

    static double readMark(Scanner sc, int markNumber) {
        while (true) {
            System.out.print("Enter Mark " + markNumber + ": ");
            String value = sc.next();

            if (value.equalsIgnoreCase("done"))
                return Double.NaN;

            try {
                double mark = Double.parseDouble(value);

                if (mark >= 0 && mark <= 100)
                    return mark;
                else
                    System.out.println("Invalid Mark");

            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            }

        }
    }

    @SuppressWarnings("DuplicatedCode")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        System.out.println();
        System.out.println("Passed or Failed Calculator");
        System.out.println("---------------");
        System.out.println();
        System.out.println("Enter Marks between 0 and 100.");
        System.out.println("Type 'done' to finish (minium 2 marks required).");
        System.out.println();

        while (true) {
            double mark = readMark(sc, count + 1);

            // done entered
            if (Double.isNaN(mark))
                if (count >= 2)
                    break;
                else {
                    System.out.println("You must enter at least two marks before finishing.");
                    continue;
                }

            sum += mark;
            count++;
        }

        int avg = (int) (sum / count);

        System.out.println();
        System.out.println("Average: " + avg);

        if (avg >= 45 && avg < 50) {
            int carveMarks = 50 - avg;
            System.out.println("You got a carve: " + carveMarks);
            avg = avg + carveMarks;
            System.out.println("Your Average After Carve : " + avg);
        }

        if (avg >= 50)
            System.out.println("Result: " + "Passed");
        else
            System.out.println("Result: " + "Failed");

        sc.close();

    }
}