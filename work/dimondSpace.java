package work;

public class dimondSpace {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("*");
            }
            for(int k=1;k<2*i-1;k++)
            {
                System.out.print(" ");
            }
             for (int j = i; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
             for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
