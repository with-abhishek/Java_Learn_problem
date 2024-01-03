package condition_statement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        if(year%4==0)
        {
            System.out.println("year is a leap yaer !!");
        }
        else
        {
            System.out.println("year is not a leap year !!");
        }
    }
    
}
