package Others.Pattern;

public class InvertedNumberPyramid {
    public static void main(String[] args) {

        /*for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*int i = 5;
        while (i >= 1) {
            int j = i;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i--;
        }*/
        int i = 5;
        do {
            int j = i;
            do {
                System.out.print(j+" ");
                j--;
            } while (j >= 1);
            System.out.println();
            i--;
        } while (i >= 1);


    }
}
