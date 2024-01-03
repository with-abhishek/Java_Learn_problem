package String_Learn;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        // String str = "Money is power";
        String word="";
        String revStr="";
        System.out.println(str.length());
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                word=word+str.charAt(i);
               
            }
            else{
                revStr=" "+word+revStr;
                word ="";
            }
        }
         revStr=word+revStr;
        System.out.println(revStr);
        System.out.println(revStr.length());
    }
}
