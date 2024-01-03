package Collection_Learn.Set.HashSet;

import java.util.HashSet;

public class Coll_SetHash
{
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();

        hs.add("Ajay");
        hs.add("Ravi");
        hs.add("Ajay");
        hs.add("Vijay");
        hs.add("Jay");
        hs.add("Jaya");
        hs.add("amir");

        System.out.println(hs);


        // It is only contains the  uniqueness ,doesn't maintain the order.
    }
}
