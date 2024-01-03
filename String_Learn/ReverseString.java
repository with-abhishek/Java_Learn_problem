
package String_Learn;

public class ReverseString {
    public static void main(String[] args) {
        
        String str1 ="Hello guys how are you";
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {

            // str2 = str1.charAt(i) + str2;
            str2 = str1.charAt(i)+str2 ;
        }
        System.out.print(str2);

        // String str ="Hello";
        // char str1=str.charAt(0);
        // System.out.println(str1);
    }

}
