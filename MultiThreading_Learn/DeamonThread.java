package MultiThreading_Learn;

class deamon extends Thread
{
    public void run()
    {
        System.out.println("run().running....");
    } 
}

public class DeamonThread {
    public static void main(String[] args) {
        deamon t1 = new deamon();
        t1.setDaemon(true);
        t1.start();
        // Thread.currentThread().setDaemon(true);
        // don't make the main method to deamon thread
        System.out.println("main");
    }
}
