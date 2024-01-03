package Array_learn;

import java.util.Arrays;
import java.util.Scanner;

public class DublicatesElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index "+i+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr) + "\n");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                     break;
                }
              
            }

        }
          System.out.println();

        System.out.println("The  total dublicates element in array is :" + count);
    }
}
