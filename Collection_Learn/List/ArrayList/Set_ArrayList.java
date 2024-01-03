package Collection_Learn.List.ArrayList;

import java.util.ArrayList;

public class Set_ArrayList {
    
    public static void main(String[] args) {
        
        ArrayList <String> al = new ArrayList<>();

        al.add("Ajay");
        al.add("vijay");
        al.add("Sanjay");
        al.add("Kapil");
        al.add("Adarsh");

        al.set(2, "Rana");
        System.out.println(al);
    }
}
