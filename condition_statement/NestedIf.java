package condition_statement;

 import java.util.Scanner;


public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int m = sc.nextInt();
        if (m <= 100) {
            if (m >= 90) {
                System.out.println("A+ grade");
            } else if (m >= 70) {
                System.out.println("B+ grade");
            } else if (m >= 60) {
                System.out.println("First div");
            } else if (m >= 33) {
                System.out.println("just pass");
            } else if (m >= 0) {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invelid input");
        }
    }

}
