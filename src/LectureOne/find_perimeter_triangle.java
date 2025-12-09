package LectureOne;

import java.util.Scanner;

public class find_perimeter_triangle {

    public static void main(String[] args) {
        int a, b, c;
        int sum;

        System.out.println("Cal. Find Perimeter for A Triangle");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a (in cm): ");
        a = input.nextInt();
        System.out.println("Enter b (in cm): ");
        b = input.nextInt();
        System.out.println("Enter c (in cm): ");
        c = input.nextInt();

        sum  = a + b + c;
        System.out.println("---------------");
        System.out.println("The perimeter is: " + sum + " cm");
    }

}