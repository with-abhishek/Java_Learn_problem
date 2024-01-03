package work;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        // int cout=0;
        int n=sc.nextInt();
        int cprime=0;
        for(int i=1;i<=n;i++)
        {   int cout=0;
            for(int j=1;j<=i;j++)
           {
            if(i%j==0)
            {
                cout++;
            }
        }
        if(cout==2)
        {
            // System.out.println("Prime Number");
            System.out.print(i+" ");
            cprime++;
        }
    }
    System.out.print("\nPrime are 1 to "+ n+ " are :"+cprime);
    
    }
    
    
}
