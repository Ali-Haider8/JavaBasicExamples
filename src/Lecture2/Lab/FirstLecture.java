package Lecture2.Lab;

import java.util.Scanner;

public class FirstLecture {

    public static void main(String[] args) {
        // data types
        int y = 7;
        double z = 4.5;
        char a = 'a';
        String A = "First Stage";

        // print statement
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("a: " + a);
        System.out.println("A: " + A);


        // انشاء object من نوع Scanner لغرض ادخال البيانات من المستخدم
        Scanner k = new Scanner(System.in);
        // اعلان متغير من نوع عدد صحيح اسمه x
        int x;
        // طباعة جملة تطالب المستخدم بادخال عدد صحيح
        System.out.print("Enter Integer number: ");
        // تعريف العدد الصحيح بانه الادخال الذي يقوم السمتخدم بكتابته من نوع عدد صحيح
        x = k.nextInt();
        // طباعة ما قام المستخدم بادخاله على الشاشة
        System.out.println("X: " + x);
        // في هذا الجزء يقوم الكود بتحويل متغير من نوع عدد عشري الى عدد صحيح
        // العدد العشري مثلا 3.14
        // يتحول الى عدد صحيح بحذف ما بعد الفارزة فيصبح 3
        System.out.print("Enter double number: ");
        double w = k.nextDouble();
        int c = (int) w;
        System.out.println(w + " to int= " + c);

        // Enter String
        System.out.print("Enter your name: ");
        String name = k.next();
        System.out.println("Hello, " + name + "!");

        // Arithmetic Operations
        int sum = 4 + 5;
        System.out.println("Sum: " + sum);
        int sub = 8 - 3;
        System.out.println("Sub: " + sub);
        int mul = 8 * 3;
        System.out.println("Mul: " + mul);
        int div = 8 / 3;
        System.out.println("Div: " + div);
        int mod = 8 % 3;
        System.out.println("Mod: " + mod);

        // Incremental and decrease
        int i = 0;
        System.out.println("i: " + i);
        i++;
        System.out.println("i: " + i);
        ++i;
        System.out.println("i: " + i);
        i++;
        System.out.println("i: " + i);
    }
}
