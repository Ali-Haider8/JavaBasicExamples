package Others.Pattern;

public class DescendingNumberPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((6 - j) + " ");
            }
            System.out.println();
        }

//        6
//        6 5
//        6 5 4
//        6 5 4 3
//        6 5 4 3 2
//        6 5 4 3 2 1
    }
}
