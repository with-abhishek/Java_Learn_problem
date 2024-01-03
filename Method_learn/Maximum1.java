package Method_learn;
public class Maximum1 {
    public int isMax(int a ,int b , int c)
    {
        if(a>b&&a>c)
        {
            return a;
        }
        else if(b>c&&b>a)
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

        Maximum1 ref =  new Maximum1();
        System.out.println(ref.isMax(7, 5,6));
       System.out.println( ref.isMax(4, 8,2));
    }
}
