package Loop1;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number:");
        int n =sc.nextInt();
        System.out.print("Enter the power of the number:");
        int p=sc.nextInt();
       int a=n;
        int i=1;
        while(i<p)
        {
            a=a*n;
            i++;
        }
        System.out.print("the power "+n+"^"+p+ " is:"+a);


    }
}
