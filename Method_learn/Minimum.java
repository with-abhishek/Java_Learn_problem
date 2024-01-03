package Method_learn;
public class Minimum {


    public int isMin(int a ,int b)
    {
        if(a<b)
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

        Minimum ref =  new Minimum();
        System.out.println(ref.isMin(7, 5));
       System.out.println( ref.isMin(4, 2));
    }
}
