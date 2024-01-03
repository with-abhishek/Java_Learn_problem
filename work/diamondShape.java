package work;

import java.util.Scanner;

public class diamondShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int i,j,px=n,py=n;
        for(i=1;i<=n+1;i++)
        {
            for(j=1;j<n*2;j++)
            {
                if(i==n+1||j==(n*2)/2||j==px ||j==py )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            px++;
            py--;
            System.out.println();
        }
        int px1=1,py1=n*2-1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<n*2;j++)
            {
                if(j==(n*2)/2||j==px1 ||j==py1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            px1++;
            py1--;
            System.out.println();
        }
    }
}
