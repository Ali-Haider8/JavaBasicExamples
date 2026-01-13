package Lecture6;

import java.util.Scanner;

public class CalculateValueOfYHW {
    public static void main(String[] args) {
        String program_name, input_msg, invalid_input_msg, result_msg;
        float x, result;
        Scanner input = new Scanner(System.in);
        program_name = "Y=1/(X²-81)";
        input_msg = "Enter a value for X: ";

        System.out.println(program_name);
        System.out.println();
        System.out.print(input_msg);
        x = input.nextFloat();
        input.close();

        result = 1 / ((x * x) - 81);
        result_msg = "The Value of Y is: " + result;
        System.out.println(result_msg);
    }
}