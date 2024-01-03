package MultiThreading_Learn;

class Threater1
{
    int seat =100;

    void bookingSeat(int r)
    {
       synchronized(this){ 
        if(r<=seat)
        {
            System.out.println(r+" Booking successfully .....");
            seat = seat-r;
            System.out.println(seat+" are remaining");
        }
        else{
            System.out.println(r+" Housefull Now we have only "+seat +" seats");
        }
    }
}
}

public class SynBlock extends Thread {

    static Threater1 ob;
    int s ;

    @Override
    public void run()
    {
        ob.bookingSeat(s);
    }
    public static void main(String[] args) {
        
        ob = new Threater1();
        SynBlock sb1 = new SynBlock();
        SynBlock sb2 = new SynBlock();
        SynBlock sb3 = new SynBlock();

        sb1.s=90;
        sb1.start();
        sb2.s=10;
        sb2.start();
        sb3.s=50;
        sb3.start();

    }
    
}
