package condition_statement;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        boolean isPrime = true;
        int input = ar.nextInt();
        if (input ==1 || input==0) {
            System.out.println("Not prime");
        } else if (input >1) {
            for (int i = 2; i <input; i++) {
                if (input % i == 0) 
                {
                    isPrime = false;
                }

            }
            if(isPrime) 
            {
                System.out.println("Prime Number");
            } else 
            {
                System.out.println("Not Prime Number");
            }
        } 
        else {
            System.out.println("Invalid Input");
        }

    }

}
