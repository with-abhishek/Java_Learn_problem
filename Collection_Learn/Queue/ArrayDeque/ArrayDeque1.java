package Collection_Learn.Queue.ArrayDeque;
import java.util.ArrayDeque;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.add("Ajay");
        ad.add("vijay");
        ad.add("Sanjay");
        ad.add("Kapil");
        ad.add("Adarsh");
        System.out.println(ad);

        ad.offer("Arpit");
        System.out.println(ad);

        System.out.println(ad.peek());

        ad.poll();
        System.out.println(ad);
    
    }
}
