package Array_learn;

// import java.util.Arrays;
import java.util.Scanner;

public class Arr1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of Array :");
        // int size = sc.nextInt();
        int arr[]=new int[5];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        // System.out.println("Elements of Array is :"+Arrays.toString(arr));
        // for (int i= 0; i < arr.length; i++) {

        //     System.out.print(arr[i]+" ");
            
        // }
        for(int a:arr) {
            System.out.print(a+" ");
        }

       

    }
    
}
