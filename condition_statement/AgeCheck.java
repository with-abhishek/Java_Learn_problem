package condition_statement;

import java.util.*;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("He is elligible for vote");
        } else {
            System.out.println("He is not elligible for vote");
        }
    }
}
