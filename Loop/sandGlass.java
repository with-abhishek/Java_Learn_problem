package Loop;
import java.util.Scanner;

public class sandGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int i, j;
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for( i=1;i<n;i++)
        {
            for( j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for( j=0;j<=i;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

}
}
