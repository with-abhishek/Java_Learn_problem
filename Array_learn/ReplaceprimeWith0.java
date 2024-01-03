package Array_learn;

import java.util.Scanner;

public class ReplaceprimeWith0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Element at index "+i+" : ");
            arr[i]=sc.nextInt();
            
        }
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 1; j <= arr[i]; j++) {
                if(arr[i]%j==0){
                    count++;
                    
                }
            }
            if(count==2)
            {
                arr[i]=0;
            }
            
        }
        System.out.println("prime replace with 0 , now array is :");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    
    }
}
