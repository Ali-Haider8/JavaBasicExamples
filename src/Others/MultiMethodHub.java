package Others;

@SuppressWarnings("unused")
public class MultiMethodHub {
    @SuppressWarnings({"UnnecessaryModifier", "CommentedOutCode"})
    public static void main(String[] args) {
//         1) Enter four numbers and print the smallest
        System.out.println(getSmallest(4, 1, 5, 4));
//        System.out.println(getFactUsingFor(5));
//        System.out.println(getFactUsingWhile(5));
//        System.out.println(getFactUsingDoWhile(5));
//        System.out.println(isPrimeUsingFor(7));
//        System.out.println(isPrimeUsingWhile(7));
//        System.out.println(isPrimeUsingDoWhile(7));
//        System.out.println(calPower(4, 2));
//        rightAngledTriangleStarsPattern(5);
//        invertedRightAngledTriangleStarsPattern(5);
//        mirroredRightTriangleStarsPattern(5);
//        pyramidTriangleStarsPattern(5);
//        printNumberDuplicate(4, 6);
//        printNumberPattern(5);
//        printNumberPatternReserve(6);
//        printPairs(4);

    }
    // 1. This method read four numbers and return the smallest number
    public static int getSmallest(int a, int b, int c, int d) {
        int small = a;
        if (b < small)
            small = b;
        if (c < small)
            small = c;
        if (d < small)
            small = d;
        return small;
    }

    public static int getFactUsingFor(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    public static int getFactUsingWhile(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public static int getFactUsingDoWhile(int n) {
        int fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= n);
        return fact;
    }

    public static boolean isPrimeUsingFor(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }

    public static boolean isPrimeUsingWhile(int n) {
        if (n <= 1) return false;
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isPrimeUsingDoWhile(int n) {
        if (n <= 1) return false;
        int i = 2;
        if (n > 2) {
            do {
                if (n % i == 0) {
                    return false;
                }
                i++;
            } while (i <= n / 2);
        }
        return true;
    }

    public static int calPower(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        return result;
    }

    public static void rightAngledTriangleStarsPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedRightAngledTriangleStarsPattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void mirroredRightTriangleStarsPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramidTriangleStarsPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNumberDuplicate(int n, int t) {
        int result = n;
        for (int i = 1; i <= t; i++) {
            System.out.print(result + " ");
            result = result * 2;
        }
    }

    public static void printNumberPattern(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printNumberPatternReserve(int lines) {
        for (int i = lines; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPairs(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
    }
}