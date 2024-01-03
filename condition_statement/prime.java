package condition_statement;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int flag=1;
        int n = sc.nextInt();
        if(n==0 || n==1)
        {
            System.out.println("not prime ");
        }
        else if(n>1){
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                   flag = 0;
                   break;
                    
                }
            }if(flag==1)
            {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        } 
   

    }
    
}
