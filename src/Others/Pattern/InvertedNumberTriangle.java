package Others.Pattern;

public class InvertedNumberTriangle {
    public static void main(String[] args) {

/*
        54321
        432
        3
*/
        int rows = 3;
        int startValue = 5;
        int endValue = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = startValue; j >= endValue; j--) {
                System.out.print(j);
            }
            System.out.println();

            startValue--;
            endValue++;
        }
    }
}
