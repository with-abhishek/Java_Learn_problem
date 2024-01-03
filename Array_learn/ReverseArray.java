package Array_learn;
import java.util.Scanner;
public class ReverseArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8};
        int[] brr=new int[arr.length];
        for(int  i=0;i<arr.length;i++)
        {
            brr[i]=arr[(arr.length-1)-i];
        }
        System.out.println("Reverse Array is :");
        for (int i : brr) {
            System.out.print(i+" ");
        }

    }
}
