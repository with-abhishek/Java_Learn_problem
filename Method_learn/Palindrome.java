package Method_learn;
import java.util.Scanner;

public class Palindrome {

    public void isPalin(int x)
    {
        int r=0,i;
        for(i=x;i>0;i=i/10)
        {
            r=r*10+i%10;
        }
        if(x==r)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        Palindrome obj = new Palindrome();
        obj.isPalin(n);
    }
}
