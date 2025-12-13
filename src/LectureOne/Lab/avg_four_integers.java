package LectureOne.Lab;

import java.util.Scanner;

public class avg_four_integers {
    public static void main(String[] args) {
        int n1, n2, n3, n4;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        n2 = input.nextInt();
        System.out.print("Enter third integer: ");
        n3 = input.nextInt();
        System.out.print("Enter fourth integer: ");
        n4 = input.nextInt();

        int result = getAvg(n1, n2, n3, n4);
        System.out.println("The Average is: " + result);

    }

    public static int getAvg(int a, int b, int c, int d) {
        int total = a + b + c + d;
        return total / 4;
    }
}
