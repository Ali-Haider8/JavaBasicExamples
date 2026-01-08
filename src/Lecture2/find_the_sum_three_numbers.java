package Lecture2;

import java.util.Scanner;

public class find_the_sum_three_numbers {

    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        System.out.print("Enter third number: ");
        n3 = input.nextInt();

        // n1 = 4;
        // n2 = 6;
        // n3 = 5;

        if (n1 > n2) {
            if (n1 > n3) {
                if (n3 < n2) {
                    // n1 greatest
                    System.out.println("n1");
                }
            }
        }

        if (n2 > n1) {
            if (n2 > n3) {
                if (n3<n1){
                    // n2 is greatest
                    System.out.println("n2");
                }
            }
        }

        if (n3>n1){
            if (n3>n2){
                if (n2<n1){
                    // n3 is greatest
                    System.out.println("n3");
                }
            }
        }



    }
}
