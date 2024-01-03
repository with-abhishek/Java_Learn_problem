package Loop;
import java.util.Scanner;

public class LdLTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i,j;
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
