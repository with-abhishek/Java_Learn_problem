package MultiThreading_Learn;

class MyThread3 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class Multithread2 {
    
    public static void main(String[] args) {
        
        MyThread3 m = new MyThread3();
        Thread th = new Thread(m);


        th.start();
    }
}
