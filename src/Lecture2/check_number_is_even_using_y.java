package Lecture2;

import java.util.Scanner;

public class check_number_is_even_using_y {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        x = input.nextInt();

        y = x - 2 * (x / 2) + 1;
        // Y = x - 2(x/2) + 1
        // 1- 2 * (x/2)
        // 2- x - 2 * (x/2)
        // 3- [ 2 * (x/2) ] + 1

        // etc: x is 4
        // y = 4 - ( 2 * (2/2) ) + 1
        // y = 4 - 4 + 1
        // y = 1
        if (y == 1)
            System.out.println("The number is even");
        else if (y == 2)
            System.out.println("The number is odd");
    }
}
