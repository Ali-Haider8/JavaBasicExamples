package Lecture9;

public class DoWhileLoopExample3 {

    public static void main(String[] args) {
        int n = 1;
        do {
            if ((n % 3 == 0) && (n % 5 == 0))
                System.out.print(n + " ");
            n++;
        } while (n <= 100);
    }
}
