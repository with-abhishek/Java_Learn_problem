/* A pronic number is a number which is the product of two consecutive integers*/

public class pronicNumber
{
    public static void main(String  args[])
    {
        int n=45;
        int num=0;
        for(int i=1;i<n/2;i++)
        {
            if(i*(i+1)==n)
            {   
                num++;
                break;
            }
        }
        if(num==1)
        {
            System.out.println("Pronic Number...");
        }
        else
        {
             System.out.println("Not Pronic Number...");
        }
    }
}