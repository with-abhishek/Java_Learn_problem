package String_Learn;

public class StringFirst {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("My name is :" + name);

        // concatentation adding two string

        String firstName = "Adarsh";
        String SecondName = "Sharma";
        String fullName = firstName + "  " + SecondName;
        System.out.println(fullName);

        // .length() to calculate the length of string

        System.out.println(fullName.length());

        // .charAt()
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");

        }
        // compareTo()
        if (firstName.compareTo(SecondName) == 0) {
            System.out.println("string are equal");
        } else {
            System.out.println("string are not equal");
        }

        // substring(beg index ,end index) where we print the string

        String str = "My name is Raj";
        String name1 = str.substring(3, str.length());
        System.out.println(name1);
        

    }

}
