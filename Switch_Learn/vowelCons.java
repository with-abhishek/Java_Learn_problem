package Switch_Learn;

import java.util.Scanner;

public class vowelCons {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char ch=input.next().charAt(0);

        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            
            System.out.println(ch+" is vowel........");
            break;
            default:
             System.out.println(ch+" is consonant ....");


        }
    }
}
