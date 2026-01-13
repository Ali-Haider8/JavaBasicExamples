package Lecture6;

import java.util.Scanner;

public class largest_four_numbers_hw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String msg, invalid_input_msg;
        int number, largest_number;

        msg = "Enter a value for number ";
        invalid_input_msg = "Invalid input, Please enter an integer number.";

        System.out.print(msg + 1 + ": ");

        while (!input.hasNextInt()) {
            System.out.println(invalid_input_msg);
            input.next(); // discard wrong input
            System.out.print(msg + 1 + ": ");
        }
        largest_number = input.nextInt();

        for (int i = 2; i <= 4; i++) {
            System.out.print(msg + i + ": ");

            while (!input.hasNextInt()) {
                System.out.println(invalid_input_msg);
                input.next(); // discard wrong input
                System.out.print(msg + i + ": ");
            }

            number = input.nextInt();
            if (number > largest_number)
                largest_number = number;

        }

        System.out.println("The largest number is " + largest_number);
        input.close();

    }
}