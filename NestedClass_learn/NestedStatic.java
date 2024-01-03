package NestedClass_learn;

class outer {

    static String name = "Ajay";
    int id =101;

    static class InnerNestedStatic {
    
        static String gfName ="Ab nahi bnana";
        int id2 =  102;

        void disp()
        {
            System.out.println(name);
            // System.out.println(id);
            System.out.println(gfName);
            System.out.println(id2);
        }
    }
}

public class NestedStatic {
    public static void main(String[] args) {
        
        outer.InnerNestedStatic In = new outer.InnerNestedStatic();
        In.disp();
    }
}
