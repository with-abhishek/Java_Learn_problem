package Collection_Learn.List.ArrayList;

import java.util.ArrayList;

public class Add1_ArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        System.out.println(al);

        for (Integer ele : al) {
            System.out.print(ele +" ");
        }
        
    }
}
