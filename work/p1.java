package work;

public class p1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1||i==j||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                 for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++)
            {
                if(j==1||i==j||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(j==1||i==j||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
               for(int k=1;k<=2*i;k++)
            {
                System.out.print(" ");
            }
             for(int j=i;j<=n;j++)
            {
                if(j==1||i==j||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
