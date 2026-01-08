package Lecture5;

public class prefix_and_postfix_increment {

    public static void main(String[] args) {
        int x = 5;


        // prefix increment
        System.out.println("X= " + x); // 5
        System.out.println("x++ : " + x++); // 5
        System.out.println("X: " + x); // 6

        // postfix increment
        x = 5;
        System.out.println("X= " + x); // 5
        System.out.println("x++ : " + ++x); // 6
        System.out.println("X: " + x); // 6

        // prefix increment
        x = 5;
        ++x;
        System.out.println("x++ : " + x); // 6


    }
}
