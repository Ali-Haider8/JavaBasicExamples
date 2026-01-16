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
public class ForLoopPowerHW {
    
    /* 
    Algorithm
    
    1) Start
    2) Read number, power
    3) declare result
    4) For: int i is 1, i is less or equal power, i equals it's value plus one every time finish the loop
    5) result = number * result
    6) print result
    7) end
    */
    
    /*
    number is 2
    power is 3
    
    result = 1
    
    for i <= 3
    result = 2 * 1
    
    
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value for the number: ");
        int number = sc.nextInt();
        int result = 1;

        System.out.print("Enter an integer value for power: ");
        int power = sc.nextInt();

        for (int i = 1; i <= power ; i++) {
                result = number * result;
        }
        
        System.out.println("Result is: " + result);
    }

}
