/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture8;

import java.util.Scanner;

/**
 *
 * @author ali_h
 */
public class ForLoopPrimeOrNotHW {

    public static void main(String[] args) {
        /*
        Prime number is the number that accept division by 1 and itself only
        for example 
        5 
        we can only 
        5 / 5 = 1
        5 / 1 = 5
        
        so 5 is prime number
        
        for example 4
        4/4=1
        4/1=4
        4/2=2
        so it accept division three times without any remain numbers
        so it not a prime number
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        System.out.println("is " + number + " a prime number? " + "\n" + "Answer is: " + (isPrime));

    }

}
