package Others;

public class NumbersFrom2To128 {
    public static void main(String[] args) {
        /*int rows = 7;
        int multiplier = 2;
        int value = 1;

        int i = 1;
        do {
            System.out.print(value + " ");
            value *= multiplier;
            i++;
        } while (i <= rows);

        for (i = 1; i <= rows; i++) {
            value = value * multiplier;
            System.out.print(value + " ");
        }*/
        /*int num=1;
        for (int i=1; i<=4; i++) {
            for (int j=1; j<=i; j++) {
                num=num*2;
                System.out.print(num+ " ");

            }
            System.out.println();*/
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                num = num * 2;
                if (num != 256)
                    System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}