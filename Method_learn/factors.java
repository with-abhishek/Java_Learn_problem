package Method_learn;

import java.util.Scanner;

public class factors {


public void calFactor(int x)
{

    for(int i=1;i<=x;i++){
        if(x%i==0)
        {
            System.out.println(i);
        }
    }
}
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    factors obj = new factors();
        obj.calFactor(n);
        
    }
    
}
