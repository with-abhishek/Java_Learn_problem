package Method_learn;

import java.util.Scanner;

class armstrong {
    int counter(int x) {
        int c = 0;
        for (int i = x; i > 0; i = i / 10) {
            c++;
        }
        return c++;
     }
     int power(int n, int p)
     { int a=n;
        for(int i=1;i<p;i++)
        {
            a=a*n;
        } 
        return a;
     }

    void isArms(int n)

    {
        int n1=n;
        int dig = counter(n1);
        int sum=0,p;int rm=0;
        for(int i=n1;i>0;i=i/10){
            rm=i%10;

            p=power( rm,dig);
            sum =sum+p;
        
    }
    if(n==sum){
        System.out.println("Number is Armstrong......");

    }
    else{
        System.out.println("Number is not Armstrong.......");
    }
}
}

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =sc.nextInt();
        armstrong ref=new armstrong();
        ref.isArms(n);

    }
}
