package Array_learn;

import java.util.Scanner;

public class MultiplyArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        { System.out.print("Enter the Element at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        int mul=1;
        for(int i=0;i<arr.length;i++)
        {
            mul=mul*arr[i];
        }
        System.out.println("The multiply of Array is :"+mul);
}
}
