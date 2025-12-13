package LectureOne.Lab;

import java.util.Scanner;

public class cal_area_circle {
    public static void main(String[] args) {
        int radiance;
        double pi = 3.14;
        double area;
        String result;

        // update from fedora os
        System.out.println("Cal. Find area of circle");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radiance of the circle (r) integer-cm: ");
        radiance = input.nextInt();

        area = pi * (radiance * radiance);
        result = "The area of the circle is: " + area + "cm²";
        System.out.println(result);

        System.out.println("---------------");
    }
}
