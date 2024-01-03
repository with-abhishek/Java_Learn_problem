package Loop;

import java.util.Scanner;

public class VshapePattern {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");
        int n = sc.nextInt();
        int i,j,px=1,py=n*2-1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<n*2;j++)
            {
                if(j==px ||j==py)
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

    }
    
}
