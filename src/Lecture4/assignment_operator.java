package Lecture4;

public class assignment_operator {

    public static void main(String[] args) {

        int x=15;
        int a=15;

        System.out.println("Assignment operators");
        System.out.println("--------------------");
        System.out.println("let: X=15");
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

        x /= 3;
        System.out.println("x=15 \n x = 15/3 \n x= 5");
        System.out.println("x /= 3");
        System.out.println("result: " + x);
        System.out.println();

        x %= 3;
        System.out.println("If X = 15 \nX/3 = 5 mod: 0 \nx%3=0");
        System.out.println("result: " + x + "\n");

    }
}
