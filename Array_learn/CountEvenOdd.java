package Array_learn;

import java.util.Scanner;

public class CountEvenOdd {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Element at index "+i+" : ");
            arr[i] = sc.nextInt();
        }

        int ceven=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ceven++;
            }
        }
         System.out.print("The even element in array is : " + ceven+"\n");

        int codd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                codd++;
            }
        }
        System.out.print("The odd element in array is : " + codd);

    }
}
