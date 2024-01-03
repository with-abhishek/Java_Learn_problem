package NestedClass_learn;

public class NestedLocal {
    static String name = "Kunal";
    int id1 =909;

    void kitnaPdu()
    {
        String Gender = "Male";

        class Local
        {
            String name2 = "Arpit";
            int id2 = 910;

            void show()
            {
                System.out.println(name);
                System.out.println(id1);
                System.out.println(Gender);
                System.out.println(name2);
                System.out.println(id2);
            }
           
        }
         Local l = new Local();
         l.show();
    }
    public static void main(String[] args) {
        
        NestedLocal nl = new NestedLocal();
        nl.kitnaPdu();
        
    }



}
