package Method_learn;
public class Maximum {


    public int isMax(int a ,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    public static void main(String[] args) 
    {

        Maximum ref =  new Maximum();
        System.out.println(ref.isMax(7, 5));
       System.out.println( ref.isMax(4, 2));
    }
}
