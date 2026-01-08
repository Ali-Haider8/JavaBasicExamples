package Lecture5;

import java.util.Scanner;

public class RelaOps {

    public static void main(String[] args) {

//        int n1 = 47;
//        int n2 = 47;

        int n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();

        System.out.println("is both numbers are equals: " + (n1 == n2));
        System.out.println("is both numbers are different: " + (n1 != n2));


    }
}
