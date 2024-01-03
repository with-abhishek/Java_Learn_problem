package Loop;

import java.util.*;

public class solid_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row :");
        int row =sc.nextInt();
           System.out.print("enter the column :");
        int col =sc.nextInt();
     
        
        for(int i=1; i<=row; i++){
            // System.out.println("*");
            for(int j=1; j<=col; j++){
                System.out.print("*"); 
            }
        System.out.println();
    }
}
    
}
