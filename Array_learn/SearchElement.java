package Array_learn;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[8];
    int flag=0;
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter the Element at index "+i+" : ");

        arr[i] = sc.nextInt();
    }
    System.out.print("enter the elemnent which you want to be search : ");
    int ele=sc.nextInt();
    int i;
    for (i = 0; i < arr.length; i++) {
        if(arr[i]==ele)
        {
            // System.out.println("Element is found at index "+i);
            flag=1;
            break;
        }
    
    }
     if(flag==1)
    {
        System.out.println("Element is found at index "+i);
    }
    else{
            System.out.println("Element is not found.");

    }


}
    


}
