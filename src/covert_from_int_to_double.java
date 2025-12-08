import java.util.Scanner;

public class covert_from_int_to_double {

    public static void main(String[] args) {
        // انشاء object من نوع Scanner لغرض ادخال البيانات من المستخدم
        Scanner k = new Scanner(System.in);
        // اعلان متغير من نوع عدد صحيح اسمه x
        int x;
        // طباعة جملة تطالب المستخدم بادخال عدد صحيح
        System.out.print("Enter Integer number: ");
        // تعريف العدد الصحيح بانه الادخال الذي يقوم السمتخدم بكتابته من نوع عدد صحيح
        x = k.nextInt();
        // طباعة ما قام المستخدم بادخاله على الشاشة
        System.out.println("X:" + x);
        // في هذا الجزء يقوم الكود بتحويل متغير من نوع عدد عشري الى عدد صحيح
        // العدد العشري مثلا 3.14
        // يتحول الى عدد صحيح بحذف ما بعد الفارزة فيصبح 3
        System.out.print("Enter double number: ");
        double w = k.nextDouble();
        int c = (int) w;
        System.out.println(c);
    }
}
