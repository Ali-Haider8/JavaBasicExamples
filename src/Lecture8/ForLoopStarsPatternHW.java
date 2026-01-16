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
public class ForLoopStarsPatternHW {

    public static void main(String[] args) {
        int rows_number = 8;

        for (int i = 1; i <= rows_number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
