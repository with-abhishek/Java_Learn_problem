package Loop;
import java.util.Scanner;

public class downRightTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value !!");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = i; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

}
