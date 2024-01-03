package work;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        int r=0;
        for(int i=n;i>0;i=i/10)
        {
            r = (r*10) + (i%10);
        }
        System.out.println("The reverse number is"+r);
        if(n==r)
        {
            System.out.print("Number is palindrome");
        }
        else
        {
            System.out.print("Not Palindrome");
        }


    }
}
