package Lecture5;

import java.util.Scanner;

public class MathOps {

    public static void main(String[] args) {


//        int x = 1, y = 2, z = 3;
        int x, y, z;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value for X : ");
        x = sc.nextInt();
        System.out.print("Input a value for Y : ");
        y = sc.nextInt();
        System.out.print("Input a value for Z : ");
        z = sc.nextInt();

//        int a = x + y - 2 / 2 + z;
        int a = x + y - 1 + z;


        /*
         * a = x + y - 1 + z
         * if x = 1, y = 2, z = 3
         *
         * a = (1) + (2) - 1 + (3)
         * a = (3) - 1 + (3)
         * a = 2 + 3
         * a = 5
         *
         * */


        int b = x + (y - 2) / (2 + z);

        /*
         *
         * b = x + (y - 2) / (2 + z)
         *
         * if x = 1, y = 2, z = 3
         *
         * b = (1) + {(2-2) / (2+3)}
         * b = 1 + { 0 / 5 }
         * b = 1 + 0
         * b = 1
         *
         *
         * b = {x + (y - 2)} / (2 + z)
         * b = {1 + (2 - 2)} / (2+3)
         * b = 1 / 5
         * b = 0.2
         * */

        System.out.println("a = " + a + "\nb = " + b);
    }
}
