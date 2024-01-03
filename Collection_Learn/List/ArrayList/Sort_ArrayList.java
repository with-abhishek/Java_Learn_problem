package Collection_Learn.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {
    public static void main(String[] args) {
        
        ArrayList <String> al = new ArrayList<>();

        al.add("Ajay");
        al.add("Vijay");
        al.add("Sanjay");
        al.add("Kapil");
        al.add("Adarsh");
        al.add("aman");
        al.add("geeta");

        Collections.sort(al);

        System.out.println(al);
    }
}
