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
public class MultiplicationTableForAnyNumber {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
    
}
