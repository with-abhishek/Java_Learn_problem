package Collection_Learn.Queue.LinkedList;

import java.util.LinkedList;

public class LinklstQueue {
        public static void main(String[] args) {
        LinkedList<String> ad = new LinkedList<>();

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
