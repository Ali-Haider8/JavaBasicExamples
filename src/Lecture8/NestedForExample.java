/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture8;

/**
 *
 * @author ali_h
 */
public class NestedForExample {

    public static void main(String[] args) {
        
        // the program use 2 loops 
        // when loop 1 start it do another loop which is print 3 numbers
        // when it Finishes print 3 numbers it do the second turn and again print 3 numbers...
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + ") " + j);
            }
            System.out.println("----");
        }
    }
}
