package String_Learn;

public class WordCount {
   
    public static void main(String[] args) {
        String str = "hey Ajay how are you";

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '||i==str.length()-1)
            {
                count++;
            }
        }
        System.out.print("Total words are : "+count);
    }
}
