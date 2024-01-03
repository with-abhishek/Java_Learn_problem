package Loop1;

import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=0,b=1,c=0,n;
        System.out.print("Enter the term of series");
        n=sc.nextInt();
         System.out.print(a +" "+b);
         int i=1;
        while(i<n)
        {
            c=a+b;
           System.out.print(" " +c);
           a=b;
           b=c;
            i++;
        }
    
    }
}
