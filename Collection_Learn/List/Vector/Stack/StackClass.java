package Collection_Learn.List.Vector.Stack;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {

        Stack<String>s = new Stack<>();

        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");

        System.out.println(s);
        System.out.println(s.search("A"));

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s.search("A"));

        System.out.println(s.empty());
        

    }
}
