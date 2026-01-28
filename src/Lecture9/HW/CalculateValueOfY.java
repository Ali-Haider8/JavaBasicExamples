package Lecture9.HW;

public class CalculateValueOfY {

    public static void main(String[] args) {

        String y = "Y = 2! + 4! + 6! + (8! + 10!) + 12! = ";

        int n = 2;
        long total_fact = 0;
        do {
            int i = 1;
            long fact = 1;

            do {
                fact = fact * i;
                i++;
            } while (i <= n);
            total_fact += fact;
            n = n + 2;
        } while (n <= 12);
        System.out.println(y + total_fact);

    }

}
