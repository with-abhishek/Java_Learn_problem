package Switch_Learn;

import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number :");
        int n1 = sc.nextInt();
        System.out.print("enter 2st number :");
        int n2 = sc.nextInt();
        System.out.print("enter a character :");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case '+':
            System.out.println(n1+n2);
            break;
             case '-':
            System.out.println(n1-n2);
            break;
             case '*':
            System.out.println(n1*n2);
            break;
             case '/':
            System.out.println(n1/n2);
            break;
             case '%':
            System.out.println(n1%n2);
            break;
            default:
            System.out.println("invalid Input");
        }

    }
    
}
