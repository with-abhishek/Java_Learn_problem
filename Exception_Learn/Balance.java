package Exception_Learn;

import java.util.Scanner;

class Antony extends Exception{
    Antony(String msg)
    {
        super(msg);
    }
}


public class Balance {
    static void withdraw(int amt) throws Antony
    {
        int bal=10000;
        if(amt>=bal)
        {
            throw new Antony("Insufficient Balance");
        }
        else{
            System.out.println("Withdraw Successful...");
        }
    }
    public static void main(String[] args) throws Antony {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ammount: ");
        int amount=sc.nextInt();
        // try {
        //     withdraw(amount);
        // } catch (Antony e) {
        //     e.printStackTrace();
        // }
         withdraw(amount);

    }
    

}
