package Others;

public class StartsPattern {
    public static void main(String[] args) {
        // Total number of levels in the pyramid
        int rows = 7;

        for (int i = 1; i <= rows; i++) {

            // 1. print spaces for alignment
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // 2. print stars with a space in between
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // 3. Move to the next line
            System.out.println();
        }
    }
}
