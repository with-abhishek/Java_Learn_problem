package Loop;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        for(int i=1; i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                // System.out.print(i + " ");
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
