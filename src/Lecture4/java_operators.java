package Lecture4;

import java.util.Scanner;

public class java_operators {
    public static void main(String[] args) {

        int x, y, r;
        int a, b;

        Scanner sc = new Scanner(System.in);


        System.out.println("Java Operators");
        System.out.println("--------------------");

        /*System.out.println("let X =  10");
        x = 10;
        System.out.println("let Y =  5");
        y = 5;*/

        System.out.print("Enter an integer value for X : ");
        x = sc.nextInt();
        System.out.print("Enter an integer value for Y : ");
        y = sc.nextInt();

        a = x;
        b = y;

        System.out.println("--------------------");


        System.out.println("Arithmetic Operations");
        System.out.println();

        r = x + y;
        System.out.println("Operator (++)");
        System.out.println("x" + " + " + "y" + " = " + r);
        System.out.println(r + "++" + " = " + (++r));
        System.out.println();

        r = x + y;
        System.out.println("Operator (--)");
        System.out.println("x" + " + " + "y" + " = " + r);
        System.out.println(r + "--" + " = " + (--r));
        System.out.println();


        System.out.println("Operator (%)");
        r = x % y;
        System.out.println(x + " % " + y + " = " + r);
        System.out.println();


        System.out.println("Operator (/)");
        r = x / y;
        System.out.println(x + " / " + y + " = " + r);
        System.out.println();


        System.out.println("Operator (*)");
        r = x * y;
        System.out.println(x + " * " + y + " = " + r);
        System.out.println();


        System.out.println("Operator (+)");
        r = x + y;
        System.out.println(x + " + " + y + " = " + r);
        System.out.println();


        System.out.println("Operator (-)");
        r = x - y;
        System.out.println(x + " - " + y + " = " + r);
        System.out.println();

        System.out.println("--------------------");
        System.out.println("Assignment operators");
        System.out.println();

        System.out.println("Operator (+=)");

        x = x + 3;
        System.out.println("x = x + 3");
        System.out.println("result: " + x);

        x = a;
        x += 3;
        System.out.println("x += 3");
        System.out.println("result: " + x);
        System.out.println();

        System.out.println("Operator (-=)");

        x = a;
        x = x - 3;
        System.out.println("x = x - 3");
        System.out.println("result: " + x);

        x = a;
        x -= 3;
        System.out.println("x -= 3");
        System.out.println("result: " + x);
        System.out.println();

        System.out.println("Operator (*=)");

        x = a;
        x = x * 3;
        System.out.println("x = x * 3");
        System.out.println("result: " + x);

        x = a;
        x *= 3;
        System.out.println("x *= 3");
        System.out.println("result: " + x);
        System.out.println();


    }
}
