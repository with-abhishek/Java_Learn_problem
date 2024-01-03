package Loop;
import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the number:");
    int n=sc.nextInt();
    int a=1;
    for(int i=1; i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(a++ +" ");
        }
        System.out.println();
    }

    }

}
