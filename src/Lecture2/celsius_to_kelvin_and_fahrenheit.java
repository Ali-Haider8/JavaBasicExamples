package Lecture2;

import java.util.Scanner;

public class celsius_to_kelvin_and_fahrenheit {
    public static void main(String[] args) {
        double celsius_temp;
        double kelvin_temp;
        double fahrenheit_temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        celsius_temp = input.nextDouble();

        kelvin_temp = 273.15 + celsius_temp;
        System.out.println("The temperature in kelvin is: " + kelvin_temp+" K");
        fahrenheit_temp = celsius_temp * ((double) 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit: " + fahrenheit_temp + " °F");


    }
}
