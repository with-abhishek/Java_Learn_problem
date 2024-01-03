package Collection_Learn.List.ArrayList;

import java.util.ArrayList;

public class RemoveAll_ArrayList {
        public static void main(String[] args) {
        
        ArrayList <String> al = new ArrayList<>();

        al.add("Ajay");
        al.add("vijay");
        al.add("Sanjay");
        al.add("Kapil");
        al.add("Adarsh");
        System.out.println("List1 :"+al);

        ArrayList <String> al1= new ArrayList<>();
        al1.add("Aman");
        al1.add("Annie");
        al1.add("Kunal");
        al1.add("Nikhil");
        al1.add("Vivek");
        System.out.println("List2 :"+al1);

        al.addAll(al1);

        System.out.println(al);

        al.removeAll(al1);

        System.out.println(al);
    }
}
