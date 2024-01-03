package Array_learn;

import java.util.Scanner;

public class ReplaceEven0andodd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Element at index "+i+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("the even element is replaced  by 0 and odd by 1,Now array is : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {

                arr[i] = 1;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
