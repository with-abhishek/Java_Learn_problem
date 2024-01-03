package Collection_Learn.List.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();

        v.add("Ajay");
        v.add("vijay");
        v.add("Sanjay");
        v.add("Kapil");
        v.add("Adarsh");

        Iterator<String> itr = v.iterator();

        while (itr.hasNext()) 
        {
            System.out.println(itr.next());   
        }

    }
}
