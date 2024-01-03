package Method_learn;
import java.util.*;
public class series_sum{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum =0 ;
        int term = sc.nextInt();
        // for(int i=1; i<term; i++)
        // {
        //     sum = sum + i;
        // }
        // System.out.println(sum);
        
        //  To print the series of N number 

        for(int i=1; i<term; i++)
        {
            System.out.print(i + " ");
            sum = sum + i;
            System.out.println(sum);
        }
        
        System.out.print(" ");

    }
    
}
