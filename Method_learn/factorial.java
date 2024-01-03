package Method_learn;

import java.util.Scanner;

public class factorial {

     public int fact1(int x)
    {
        int fact =1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public void fact2(int y)
    {
        int fact =1;
        for(int i=1;i<=y;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");

        int n=sc.nextInt();
        
        factorial obj = new factorial();
        System.out.println(obj.fact1(n));

        obj.fact2(n);
        

    }
}
