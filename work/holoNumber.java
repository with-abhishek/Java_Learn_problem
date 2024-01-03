package work;

import java.util.Scanner;

public class holoNumber {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number: ");
        int n = sc.nextInt();
        // int ch =sc.next().charAt(0);
        // int m = sc.nextInt();
       
        int len=2*n-1;
        int start=0;
        int end = len-1;
        int arr[][]=new int[len][len];
        // char arr[][]=new char[len][len];

        while (n!=0) {
        for(int i=start; i<=end; i++){
            for(int j=start; j<=end; j++){
                if(i==start|| i==end || j==start || j==end){
                   arr[i][j]=n;
                // arr[i][j]=(char) ch;

                }
            }
        }
        
        start++;
        end--;
        n--;
        // ch--;
    }
    for (int i = 0; i< len; i++) {
        for (int j = 0; j <len; j++) {
            System.out.print((arr[i][j]<10?("0"+arr[i][j]):arr[i][j])+" ");
        }
        System.out.println();
        
    }
    }
}
