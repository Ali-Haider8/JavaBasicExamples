package Lecture2;


import java.util.Scanner;

public class check_number_if_equal_1000 {

    public static void main(String[] args) {


        int n;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Guess a number between 1-1000 ");

        n = 1;
        while (n != 1000) {
            System.out.print("Enter a number: ");
            n = input.nextInt();
        }

        System.out.println("Correct! " + n);


    }
}