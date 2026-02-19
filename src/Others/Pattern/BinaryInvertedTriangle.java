package Others.Pattern;

public class BinaryInvertedTriangle {
    public static void main(String[] args) {
/*
        010101
        0101
        01
*/
        for (int i = 6; i >= 2; i = i - 2) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }
}
