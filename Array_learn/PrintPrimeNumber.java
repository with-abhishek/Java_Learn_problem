package Array_learn;

import java.util.Scanner;

public class PrintPrimeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Element at index "+i+" : ");
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Prime numbers are: ");
        // int c=0;  for counting the prime number in array
        for (int i = 0; i < arr.length; i++) {
        //    for check the prime number using this loop
            int count =0;
            for (int j = 1; j <= arr[i]; j++) {
                if(arr[i]%j==0){
                    count++;
                    
                }
            }
            if(count==2)
            {
                // c++;
                System.out.print(arr[i]+" ");
            }
            
        }
        // System.out.println(c);
    }
}