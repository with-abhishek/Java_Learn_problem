package Method_learn;
public class Minimum1 {
    public int isMin(int a ,int b , int c)
    {
        if(a<b&&a<c)
        {
            return a;
        }
        else if(b<c&&b<a)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    
    public static void main(String[] args) 
    {

        Minimum1 ref =  new Minimum1();
        System.out.println(ref.isMin(7, 5,6));
       System.out.println( ref.isMin(4, 8,2));
    }
}

