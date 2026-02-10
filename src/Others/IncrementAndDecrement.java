package Others;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        a= a+b++;
        b = --a+b;
        System.out.println(a++);
        System.out.println(a);
//        System.out.println(++a);
    }
}
