public class primeNumber
{
    public static void main(String[] args) {
        
    int n=100;

    for (int i = 2; i < n; i++) {
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            // for(int j=2;j<=Math.sqrt(i);j++)--> best time complexity compare to ^ above for loop
        {
            if(i%j==0)
            {
                count++;
                break;
            }
        }if(count==0){
        System.out.print(i+" ");
        }
        
    }
    
    }
}