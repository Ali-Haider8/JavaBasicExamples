package Lecture2;

public class positive_and_negative_between_1_to_10 {
    public static void main(String[] args) {
        System.out.println("Even and odd numbers between 1 and 10:");

        for (int i = 1; i <= 10; i++)
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");

    }
}
