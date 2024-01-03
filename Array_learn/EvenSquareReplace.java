package Array_learn;

import java.util.Scanner;

public class EvenSquareReplace {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[8];
        for(int i=0;i<arr.length;i++)
        { System.out.print("Enter the Element at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("the even element in array is replaced by their square: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                
                arr[i]=arr[i]*arr[i];
            }
        }

        for (int i : arr) {
            System.out.print(i +" ");
        }
    
} 
}
