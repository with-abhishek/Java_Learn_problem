package Array_learn;

import java.util.Arrays;
import java.util.Scanner;

public class SquareArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {    System.out.print("Enter the Element at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The Actual Arrays is :"+Arrays.toString(arr));
         for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
         System.out.println("The square Arrays is :"+Arrays.toString(arr));
    }
}
