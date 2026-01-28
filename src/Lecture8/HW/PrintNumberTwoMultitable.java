package Lecture8.HW;

public class PrintNumberTwoMultitable {
    public static void main(String[] args) {
        int number = 2;
        for (int i = 1; i <= 8; i++) {
            System.out.print(number + " ");
            number *= 2;
        }
    }
}
