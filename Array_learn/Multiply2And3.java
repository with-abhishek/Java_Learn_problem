package Array_learn;

import java.util.Scanner;

public class Multiply2And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("the even element multiply by 2 and odd by 3 : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                arr[i] = arr[i] * 2;
            } else {
                arr[i] = arr[i] * 3;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
