package Lecture9.HW;

public class PrintStarsPattern {
    public static void main(String[] args) {
        int i = 1;
        do {
            int j = 5;
            do {
                System.out.print("*");
                j--;
            } while (j >= i);
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
