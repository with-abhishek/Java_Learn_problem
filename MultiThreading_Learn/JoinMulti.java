package MultiThreading_Learn;

class Mythread implements Runnable
{
    private String name;

    public Mythread(String name)
    {
        this.name = name;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println(name+" is "+ i);
        }
    }
}

public class JoinMulti
{
    public static void main(String[] args) {
        // Mythread my = new Mythread("thread");
        // Thread th = new Thread(my);

        Thread t1 = new Thread(new Mythread("Phupha Ji"));
        Thread t2 = new Thread(new Mythread("Jija Ji"));
        Thread t3 = new Thread(new Mythread("T3"));
        Thread t4 = new Thread(new Mythread("T4"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
             t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        
    }
}