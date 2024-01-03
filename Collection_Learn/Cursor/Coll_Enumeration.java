import java.util.Enumeration;
import java.util.Vector;

public class Coll_Enumeration {
    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<>();

        for(int i=0;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v);

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {

            Integer i = (Integer) e.nextElement();

            if(i%2==0)
            {
                System.out.println("Cursor :"+i);
            }
            
        }
        System.out.println(v);
    }
}
