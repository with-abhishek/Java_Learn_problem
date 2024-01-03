package work;
import java.util.Scanner;

public class factors {
        public static void main(String[] args) {
            Scanner  sc = new Scanner(System.in);
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            for(int i=1 ; i<=n; i++)
            {
                if(n%i==0)
                {
                    System.out.println("Factors is:"+i);
                }
            }
        }
    }