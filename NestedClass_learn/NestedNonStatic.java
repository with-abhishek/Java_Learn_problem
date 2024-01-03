package NestedClass_learn;
class outer1 {

    static String name = "Ajay";
    int id =101;

    class InnerNestedNonStatic {
    
        static String gfName ="Ab nahi bnana";
        int id2 =  102;

        void disp()
        {
            System.out.println(name);
            System.out.println(id);
            System.out.println(gfName);
            System.out.println(id2);
        }
    }
    
}

public class NestedNonStatic {
    public static void main(String[] args) {
        outer1 ot = new outer1();
        outer1.InnerNestedNonStatic In = ot.new InnerNestedNonStatic();
        In.disp();
    }
}
