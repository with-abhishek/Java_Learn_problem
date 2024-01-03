package MultiThreading_Learn;

class MyThread4 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread "+i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
public class MultiThread
{
    public static void main(String[] args) {
        MyThread4 mt = new MyThread4();
        mt.start();
    }
}