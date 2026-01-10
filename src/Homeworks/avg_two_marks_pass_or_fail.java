package Homeworks;

import java.util.Scanner;

public class avg_two_marks_pass_or_fail {

    public static void main(String[] args) {
        float m1 = 0, m2, avg;
        boolean validInput1, validInput2;
        float input;
        boolean passed;

        Scanner sc = new Scanner(System.in);

        System.out.println("Success or Fail Calculator");
        System.out.println("---------------");
        System.out.println();

        do {
            System.out.print("Enter first mark: ");
            input = sc.nextFloat();
            validInput1 = input >= 0 && input <= 100;
            if (!validInput1)
                System.out.println("Invalid input!");
            else {
                m1 = input;


            }

        } while (!validInput1);


        do {
            System.out.print("Enter Second mark: ");
            input = sc.nextFloat();
            validInput2 = input >= 0 && input <= 100;
            if (!validInput2)
                System.out.println("Invalid input!");
            else {
                m2 = input;

                avg = (m1 + m2) / 2;
                passed = avg >= 50;
                System.out.println();

                if (passed)
                    System.out.println("The Average is: " + avg + "\n" + "Passed!");
                else
                    System.out.println("The Average is: " + avg + "\n" + "Failed!");
            }

        } while (!validInput2);
    }

}
