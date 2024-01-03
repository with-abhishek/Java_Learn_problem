package MultiThreading_Learn;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "===" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadPool {
    public static void main(String[] args) {

        System.out.println("Hello 1");

        Runnable r1 = new Task("t1");
        Runnable r2 = new Task("t2");
        Runnable r3 = new Task("t3");
        Runnable r4 = new Task("t4");
        Runnable r5 = new Task("t5");

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        System.out.println("Hello 2");

    }
}
