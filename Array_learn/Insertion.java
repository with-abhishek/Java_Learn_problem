package Array_learn;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Input the Size of the Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        for (int i = 0; i <size; i++) {
            System.out.print("Enter the Element at index "+i+" : ");
            arr[i]=sc.nextInt();
            
        }
        System.out.println(arr.length);
       int pos,value;
        System.out.print("Enter the position of element: ");
        pos=sc.nextInt();
        System.out.print("Enter the element at position "+pos+" : ");
        value=sc.nextInt();

        for (int i=arr.length-1; i>=pos; i--) {
            arr[i]=arr[i-1];
        }
        arr[pos]=value;
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
