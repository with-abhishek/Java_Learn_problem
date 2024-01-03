package Method_learn;
import java.util.Scanner;


public class calPower{


public void isPower(int x, int m)
{
    int a=x;
    for(int i=1;i<m;i++)
    {
        a=a*x;
    }
    System.out.println(" The power is : "+a);
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
         System.out.print("Enter the power of number :");
        int p = sc.nextInt();
        

        
        calPower ref = new calPower();
        ref.isPower(n, p);


    }

}