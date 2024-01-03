package String_Learn;

import java.util.Scanner;
public class WordString {

    public static void main(String[] args) {
        // String str = "hyper text transfer protocols";
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(i==0)
            {
                System.out.print(str.toUpperCase().charAt(i));
            }
            if(str.charAt(i)==' ')
            {
                System.out.print(str.toUpperCase().charAt(i+1));
            }
        }
        // String[] arStr=str.split(" ");
        // for (int i = 0; i < arStr.length; i++) {
        //     System.out.print(arStr[i].toUpperCase().charAt(0));
        // }
    }
}
