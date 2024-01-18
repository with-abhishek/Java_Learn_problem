package Array_learn;

public class LargestElement{
    public static void main(String[] args) {
        
        int [] ar = {12,42,4,5,6,9,53};
        int lg=ar[0];

        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>lg){
                lg=ar[i];
            }
        }
        System.out.println("Largest Elemnt of array is : "+ lg);
    }
}