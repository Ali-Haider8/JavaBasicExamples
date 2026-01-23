package Homeworks;

import java.util.Scanner;

public class Biggest_four_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // قراءة الأرقام من المستخدم
        System.out.print("أدخل الرقم الأول: ");
        int a = input.nextInt();

        System.out.print("أدخل الرقم الثاني: ");
        int b = input.nextInt();

        System.out.print("أدخل الرقم الثالث: ");
        int c = input.nextInt();

        System.out.print("أدخل الرقم الرابع: ");
        int d = input.nextInt();

        // إيجاد الأكبر
        int max = a; // نفترض أن a هو الأكبر
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        // طباعة النتيجة
        System.out.println("أكبر رقم هو: " + max);


    }
}
