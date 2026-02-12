package Others;

public class NumbersFrom2To128 {
    public static void main(String[] args) {
        int rows = 7;
        int multiplier = 2;
        int value = 2;

        int i = 1;
        do {
            System.out.print(value + " ");
            value *= multiplier;
            i++;
        } while (i <= rows);
    }
}
