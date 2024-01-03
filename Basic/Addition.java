package Basic;

import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
         int a= sc.nextInt() ; 
        // int a =2;
         System.out.println("Enter a second Number");
         int b = sc.nextInt() ;
        // int b=3;
          int res = a + b;
        System.out.println("Result"+"="+ res);
    }
    
}