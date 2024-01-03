package Method_learn;

import java.util.Scanner;

// class checkPrime {
    // public void isPrime(int x) {
    //     int i, count = 0;
    //     for (i = 1; i <= x; i++) {
    //         if (x % i == 0) {
    //             count++;
    //         }
    //     }
    //     if (count == 2) {
    //         System.out.print("Number is Prime ");
    //     } else {
    //         System.out.print("Number is not Prime ");
    //     }
    // }
// }
public class prime {

    public void isPrime(int x) {
        int i, count = 0;
        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.print("Number is Prime ");
        } else {
            System.out.print("Number is not Prime ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        // checkPrime ref = new checkPrime();
        prime ref = new prime();
        ref.isPrime(n);

    }
}
