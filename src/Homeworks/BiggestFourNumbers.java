package Homeworks;

import java.util.Scanner;

public class BiggestFourNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = 1;
        for (int i = 1; i <= 4; i++) {
            int number = input.nextInt();
            if (number>max)
                max = number;
        }
        System.out.println(max);

    }
}
