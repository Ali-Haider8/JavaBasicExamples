package Others;

public class Test {

    public static void main(String[] args) {

        boolean isPrime = true;
        int n = 7;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        System.out.println(isPrime);
    }
}
