package work;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a = sc.nextInt();
        System.out.print("enter 2nd number:");
        int b = sc.nextInt();
        System.out.print("enter 3rd number:");
        int c = sc.nextInt();

        if(a>b&&a>c)
        {
           System.out.println("the maximum is :"+a);
        }
        else if(b>c&&b>a)
        {
            System.out.println("the maximum is :"+b);
        }
        else
        {
            System.out.println("the maximum is :"+c);
        }
    }
}
