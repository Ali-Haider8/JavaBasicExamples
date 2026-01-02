package Lecture4;

public class narrowing_casting {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
