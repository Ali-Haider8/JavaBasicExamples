package Lecture6;

import java.util.Scanner;

public class student_average_cal_hw_ver2 {

    static double readMark(Scanner input, int markNumber) {
        while (true) {
            System.out.print("Enter Mark " + markNumber + ": ");
            String value = input.next();

            if (value.equalsIgnoreCase("done")) {
                return Double.NaN;
            }

            try {
                double mark = Double.parseDouble(value);
                if (mark >= 0 && mark <= 100) {
                    return mark;
                } else {
                    System.out.println("Invalid Mark!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input, please enter a number");

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float student_avg;
        String result;
        double sum = 0;
        int count = 0;

        System.out.println();
        System.out.println("Average Calculator");
        //noinspection DuplicatedCode
        System.out.println("---------------");
        System.out.println();
        System.out.println("Enter Marks between 0 and 100.");
        System.out.println("Type 'done' to finish (minium 2 marks required).");
        System.out.println();

        //noinspection DuplicatedCode
        while (true) {
            double mark = readMark(sc, count + 1);

            // done entered
            if (Double.isNaN(mark)) {
                if (count >= 2) {
                    break;
                } else {
                    System.out.println("You must enter at least two marks before finishing.");
                    continue;
                }
            }

            sum += mark;
            count++;
        }

        student_avg = (float) (sum / count);
        result = student_average_result(student_avg);
        System.out.println();

        if (student_avg >= 45 && student_avg < 50) {
            System.out.println("Your Average now is: " + student_avg);
            float carve_marks = 50 - student_avg;

            System.out.println("You got a " + carve_marks + " carve marks" + "\n");
            System.out.println("Your Average now is: " + (student_avg + carve_marks));
        } else {
            System.out.println("Your Average is: " + student_avg);
            System.out.println("The Result is: " + result);
        }
        sc.close();


    }

    static String student_average_result(float student_avg) {
        if (student_avg > 100 || student_avg < 0)
            return "Out of Range";
        else if (student_avg > 0 && student_avg < 45)
            return "Fail";
        else if (student_avg > 45 && student_avg < 50)
            return "Passed by carve";
        else if (student_avg >= 50 && student_avg < 60)
            return "Accepted";
        else if (student_avg >= 60 && student_avg < 70)
            return "Medium";
        else if (student_avg >= 70 && student_avg < 80)
            return "Good";
        else if (student_avg >= 80 && student_avg < 90)
            return "Very Good";
        else if (student_avg >= 90 && student_avg < 100)
            return "Excellent";
        else
            return "Invalid Input";

    }

}
