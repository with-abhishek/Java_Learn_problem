package Array_learn;

import java.util.Scanner;

public class EvenoddArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr=new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Element at index "+i+" : ");
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Even array is :");
         for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
            }
        }
         System.out.println("\nodd array is :");
          for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0){
            System.out.print(arr[i]+" ");
            }
        }


    }
    
}
