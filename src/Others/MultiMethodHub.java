package Others;

@SuppressWarnings("unused")
public class MultiMethodHub {
    @SuppressWarnings({"UnnecessaryModifier", "CommentedOutCode"})
    public static void main(String[] args) {
        // Uncomment the line you want to test:

        // 1) Enter four numbers and print the smallest
//        System.out.println(getSmallest(4, 1, 5, 4));

        // 2) Calculate factorial using for loop
//        System.out.println(getFactUsingFor(5));

        // 3) Calculate factorial using while loop
//        System.out.println(getFactUsingWhile(5));

        // 4) Calculate factorial using do-while loop
//        System.out.println(getFactUsingDoWhile(5));

        // 5) Check if number is prime using for loop
//        System.out.println(isPrimeUsingFor(7));

        // 6) Check if number is prime using while loop
//        System.out.println(isPrimeUsingWhile(7));

        // 7) Check if number is prime using do-while loop
//        System.out.println(isPrimeUsingDoWhile(7));

        // 8) Calculate power (base^power)
//        System.out.println(calPower(4, 2));

        // 9) Print right-angled triangle pattern
//        rightAngledTriangleStarsPattern(5);

        // 10) Print inverted right-angled triangle pattern
//        invertedRightAngledTriangleStarsPattern(5);

        // 11) Print mirrored right triangle pattern
//        mirroredRightTriangleStarsPattern(5);

        // 12) Print pyramid triangle pattern
//        pyramidTriangleStarsPattern(5);

        // 13) Print numbers that double each time
//        printNumberDuplicate(4, 6);

        // 14) Print number pattern (increasing)
//        printNumberPattern(5);

        // 15) Print number pattern (reverse)
//        printNumberPatternReserve(6);

        // 16) Print all pairs of numbers
//        printPairs(4);
    }


    // 1. Find the smallest number among four numbers
    // Example: getSmallest(4, 1, 5, 4) returns 1
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

    // 2. Calculate factorial using for loop
    // Example: getFactUsingFor(5) returns 120 (5! = 5*4*3*2*1)
    public static int getFactUsingFor(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    // 3. Calculate factorial using while loop
    // Example: getFactUsingWhile(5) returns 120
    public static int getFactUsingWhile(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    // 4. Calculate factorial using do-while loop
    // Example: getFactUsingDoWhile(5) returns 120
    public static int getFactUsingDoWhile(int n) {
        int fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= n);
        return fact;
    }

    // 5. Check if a number is prime using for loop
    // Example: isPrimeUsingFor(7) returns true, isPrimeUsingFor(8) returns false
    public static boolean isPrimeUsingFor(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }

    // 6. Check if a number is prime using while loop
    // Example: isPrimeUsingWhile(7) returns true
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

    // 7. Check if a number is prime using do-while loop
    // Example: isPrimeUsingDoWhile(7) returns true
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

    // 8. Calculate power (base raised to power)
    // Example: calPower(4, 2) returns 16 (4^2)
    public static int calPower(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        return result;
    }

    // 9. Print right-angled triangle pattern with stars
    // Example: rightAngledTriangleStarsPattern(5) prints:
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void rightAngledTriangleStarsPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 10. Print inverted right-angled triangle pattern with stars
    // Example: invertedRightAngledTriangleStarsPattern(5) prints:
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void invertedRightAngledTriangleStarsPattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 11. Print mirrored right triangle pattern with stars
    // Example: mirroredRightTriangleStarsPattern(5) prints:
    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
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

    // 12. Print pyramid triangle pattern with stars
    // Example: pyramidTriangleStarsPattern(5) prints:
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
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

    // 13. Print numbers that double each time
    // Example: printNumberDuplicate(4, 6) prints: 4 8 16 32 64 128
    public static void printNumberDuplicate(int n, int t) {
        int result = n;
        for (int i = 1; i <= t; i++) {
            System.out.print(result + " ");
            result = result * 2;
        }
    }

    // 14. Print number pattern (increasing)
    // Example: printNumberPattern(5) prints:
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void printNumberPattern(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 15. Print number pattern (reverse/descending)
    // Example: printNumberPatternReserve(6) prints:
    // 6 5 4 3 2 1
    // 5 4 3 2 1
    // 4 3 2 1
    // 3 2 1
    // 2 1
    // 1
    public static void printNumberPatternReserve(int lines) {
        for (int i = lines; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 16. Print all possible pairs of numbers from 1 to max
    // Example: printPairs(4) prints: (1,1) (1,2) (1,3) (1,4) ... (4,4)
    public static void printPairs(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
    }
}