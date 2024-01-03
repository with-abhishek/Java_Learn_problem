package Array_learn;

import java.util.Arrays;
import java.util.Scanner;

public class DeletionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of an array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        { System.out.print("Enter the Element at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int pos=4;
        for(int i=pos-1;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
        // System.out.println("After deleting the element :"+Arrays.toString(arr));
        for (int i =0; i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
