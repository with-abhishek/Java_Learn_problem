package Collection_Learn.Set.TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Coll_SetTree
{
    public static void main(String[] args) {
        
        SortedSet<String> ss= new TreeSet<>();

        ss.add("Ragini Bhabhi");
        ss.add("Shreya Bhabhi");
        ss.add("Chadni Bhabhi");
        ss.add("riya Bhabhi");
        ss.add("Ragini Bhabhi");
        ss.add("Priti Bhabhi");
        ss.add("Pinki Bhabhi");

        System.out.println(ss);

    }
}