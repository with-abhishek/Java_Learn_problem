package MultiThreading_Learn;

class Threater
{
    int seat =100;

   synchronized void bookingSeat(int r)
    {
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

public class SeatBooking extends Thread {

    static Threater ob;
    int s ;

    @Override
    public void run()
    {
        ob.bookingSeat(s);
    }
    public static void main(String[] args) {
        
        ob = new Threater();
        SeatBooking sb1 = new SeatBooking();
        SeatBooking sb2 = new SeatBooking();
        SeatBooking sb3 = new SeatBooking();

        sb1.s=90;
        sb1.start();
        sb2.s=10;
        sb2.start();
        sb3.s=50;
        sb3.start();

    }
    
}
