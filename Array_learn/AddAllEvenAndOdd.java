package Array_learn;

import java.util.Scanner;

public class AddAllEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
    
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Element at index "+i+" : ");

            arr[i] = sc.nextInt();
        }

        int sumeven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumeven += arr[i];
            }
        }
        System.out.print("The Addition of even element in array is : " + sumeven + "\n");

        int sumodd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sumodd += arr[i];
            }
        }
        System.out.print("The Addition of odd element in array is : " + sumodd);

    }
}
