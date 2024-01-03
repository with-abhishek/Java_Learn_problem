/* An automorphic number is a number whose square "ends" in the same digits as the number itself */
import java.util.Scanner;

public class autoMorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sqr = n * n;

        int rem = 0;
        int temp = n;
        int count = 0;

        // Count the number of digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int div = 1;
        for (int i = 0; i < count; i++) {
            div =div* 10;
        }

        // Check if the last digits of the square equal the input number
        if (sqr % div == n) {
            System.out.println("Automorphic Number...");
        } else {
            System.out.println("Not Automorphic Number...");
        }
    }
}