package Lecture6;

import java.util.Scanner;

public class summation_four_numbers_hw {

    public static void main(String[] args) {
        int number, sum = 0;
        String msg, invalid_input_msg;
        Scanner input = new Scanner(System.in);

        msg = "Enter an integer value for number ";
        invalid_input_msg = "Invalid input! Please enter an integer.";

        for (int i = 1; i <= 4; i++) {
            System.out.print(msg + i + ": ");

            while (!input.hasNextInt()){
                System.out.println(invalid_input_msg);
                input.next(); // discard invalid input
                System.out.print(msg + i + ": ");
            }

            number = input.nextInt();
            sum += number;
        }
        input.close();

        System.out.println("The sum is: " + sum);

    }
}