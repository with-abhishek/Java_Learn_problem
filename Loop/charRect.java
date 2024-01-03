package Loop;

import java.util.Scanner;

public class charRect {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1; j<=n;j++)
            {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
