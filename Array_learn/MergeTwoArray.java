package Array_learn;

public class MergeTwoArray {
    /*  arr1[]={1,2,32,42,15,5,3,1,}
     arr2[]={3,23,34,41,56,55,31,12,}
    megre with third array on even position arr1 and on odd position arr2*/

public static void main(String[] args) {
    int[] arr={1,2,3,4,55,6};
    int[] brr={4,23,13,34,51};
    int[] crr=new int[(arr.length)+(brr.length)];
    System.out.println(crr.length);
    // int j=0;
    for (int i = 0; i < brr.length; i++) {
        crr[2*i]=arr[i];
        crr[2*i+1]=brr[i];

        // crr[i]=arr[i];
        // crr[i+1]=brr[i];

        // j=j+2;
    }
    for (int i : crr) {
        System.out.print(i+" ");
    }
}
}
