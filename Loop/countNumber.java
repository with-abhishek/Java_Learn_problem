package Loop;

import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc .nextInt();
        int i,count=0;
        for(i=num;i>0;i=i/10)
        {
            count++;
        }
        System.out.println("The digit of number is: "+count);
    }
    
}
