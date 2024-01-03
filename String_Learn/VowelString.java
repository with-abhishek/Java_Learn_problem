package String_Learn;

public class VowelString {
    
    public static void main(String[] args) {
        String str = "hey Ajay how are you";
        int cv=0;
        int cc=0;
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='I'||str.charAt(i)=='i'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='u' )&& str.charAt(i)!=' ')
            {
                // System.out.print(str.charAt(i));
                cv++;
            }
            else
            { if(str.charAt(i)!=' ')
                // System.out.print(str.charAt(i));
                cc++;
            }
        }
        System.out.println("vowels are : "+cv);
        System.out.println("Consonant are : "+cc);

    }
}
