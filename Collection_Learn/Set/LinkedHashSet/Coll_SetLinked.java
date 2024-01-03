package Collection_Learn.Set.LinkedHashSet;
import java.util.LinkedHashSet;

public class Coll_SetLinked {

        public static void main(String[] args) {
        
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("Ajay");
        hs.add("Ravi");
        hs.add("Ajay");
        hs.add("Vijay");
        hs.add("Jay");
        hs.add("Jaya");
        hs.add("amir");

        System.out.println(hs);

        hs.remove("Jay");
        System.out.println(hs);


        // It contains the  uniqueness and  maintain the order of the element .
    }
}

