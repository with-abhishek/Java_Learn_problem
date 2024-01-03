package Polymorphism_Learn;
class Add
{
    int sum()
    {
        return 80+20;
    }
     int sum(int x)
    {
        return x+40;
    }
     int sum(int x, int y)
    {
        return x+y;
    }
     float sum(int x,float y)
    {
        return x+y;
    }
    float sum(float x,int y)
    {
        return x+y;
    }
    float sum(float x,float y)
    {
        return x+y;
    }
}

public class polyOverloading {
    public static void main(String[] args) {
        
        Add A = new Add();
        System.out.println(A.sum());
        System.out.println(A.sum(10));
       System.out.println(A.sum(10,20));
    }
}
