package LectureOne;

import java.util.Scanner;

public class fahrenheit_to_celsius {
    public static void main(String[] args) {
        float fahrenheit, celsius;
        String result;

        System.out.println("Cal. convert fahrenheit to celsius. ");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextFloat();

        celsius = (fahrenheit - 32) / ((float) 9 / 5);
        result = "The temperature in celsius is: " + celsius;
        System.out.println(result);


        System.out.println("---------------");
    }
}
