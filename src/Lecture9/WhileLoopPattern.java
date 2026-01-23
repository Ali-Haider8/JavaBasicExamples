package Lecture9;

public class WhileLoopPattern {

    public static void main(String[] args) {
        int i = 1, j;
        while (i <= 6) {
            j = 1;
            while (j <= i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
