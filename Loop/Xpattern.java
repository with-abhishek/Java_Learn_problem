package Loop;

import java.util.Scanner;

public class Xpattern {
 public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==n/2+1 || j==n/2+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

