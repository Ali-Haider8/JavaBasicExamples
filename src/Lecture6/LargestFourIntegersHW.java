package Lecture6;

import java.util.Scanner;

public class LargestFourIntegersHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String msg;
        int number, largest_number = 0;
        msg = "Enter a value for number ";

        for (int i = 1; i <= 4; i++) {
            System.out.print(msg + i + ": ");

            number = input.nextInt();
            if (number > largest_number)
                largest_number = number;

        }

        input.close();
        System.out.println("The largest number is " + largest_number);

    }
}