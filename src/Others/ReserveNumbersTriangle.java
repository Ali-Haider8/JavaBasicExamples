package Others;

public class ReserveNumbersTriangle {
    static void main(String[] args) {

        /*for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for (int i = 6; i >= 1; i--) {
            for (int j = 6; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        int i, j, k;
        for (i = 1; i <= 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
