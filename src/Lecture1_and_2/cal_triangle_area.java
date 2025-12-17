package Lecture1_and_2;

import java.util.Scanner;

public class cal_triangle_area {
    public static void main(String[] args) {
        int base, height;
        double area;
        String result;

        System.out.println("Cal. Find area of a triangle");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value (integer/cm) : ");
        base = input.nextInt();
        System.out.print("Enter the height value (integer/cm) : ");
        height = input.nextInt();

        area = 0.5 * base * height;
        result = "The area of the triangle is: " + area + "cm";
        System.out.println(result);

        System.out.println("---------------");
    }
}
