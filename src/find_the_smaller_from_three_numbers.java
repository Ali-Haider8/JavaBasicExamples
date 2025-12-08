import java.util.Scanner;

public class find_the_smaller_from_three_numbers {

    public static void main(String[] args) {
        int x, y, z;

        System.out.println("Cal. to Find the smaller among x,y and z");
        System.out.println("---------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter X: ");
        x = input.nextInt();
        System.out.println("Enter Y: ");
        y = input.nextInt();
        System.out.println("Enter Z: ");
        z = input.nextInt();

        System.out.println("---------------");
        System.out.println("The smallest number is ");

        if (x < y && x < z) {
            System.out.println("X: " + x);
        } else if (y < x && y < z) {
            System.out.println("Y:" + y);
        } else {
            System.out.println("Z:" + z);
        }
    }
}