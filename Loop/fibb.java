package Loop;
import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int n1=0;
        int n2=1;
        int series=0;
        if(num==0)
        {
            System.out.println(n1);
        }
        else if(num>=1)
        {   System.out.print(n1+" "+n2);
            for(int i =1;i<num;i++)
            {
                series = n1+n2;
                n1=n2;
                n2=series;
                System.out.print(" "+ n2);
                
             } 
            //  System.out.print("\n"+num +"th series is:"+ series);
           
        } 
        else
        {
            System.out.println("Invalid Input");
        }
    }
    
}
