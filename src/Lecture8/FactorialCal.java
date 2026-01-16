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
public class FactorialCal {

    // Factorial for 5 --> 5! = 5*4*3*2*1 = 120
    // !0 = 1
    
    /* why using factorial
    
    we use factorial to counting arrangements 
    for example the number of ways to arrange 4 books is
    4! = 4*3*2*1 = 24
    
    */
    
    public static void main(String[] args) {
        // any number factorial start from 1
        int fact = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            //fact = fact * i;
            fact *= i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }

}
