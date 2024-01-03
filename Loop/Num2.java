package Loop;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
