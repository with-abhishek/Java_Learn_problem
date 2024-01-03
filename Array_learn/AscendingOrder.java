package Array_learn;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr ={4,32,5,1,6,9,7,3,12};
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                int temp;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }  
        }
    }
        System.out.print("The element is ascending order in :");
        for (int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}
