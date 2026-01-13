package Lecture6;

import java.util.Scanner;

public class largest_four_numbers_ver2_hw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String msg, invalid_input_msg, result_msg;
        int number, largest_number = Integer.MIN_VALUE;

        msg = "Enter number #";
        invalid_input_msg = "Integer numbers only!, Please try again";
        result_msg = "The Largest Number is: ";

        for (int i = 1; i <= 4; i++){
            System.out.print(msg + i + ": ");

            while (!input.hasNextInt()) {
                System.out.println(invalid_input_msg);
                input.next(); // discard invalid input
                System.out.print(msg + i + ": ");
            }

            number = input.nextInt();
            largest_number = Math.max(largest_number, number);

        }

        System.out.println(result_msg + largest_number);
        input.close();
    }
}
