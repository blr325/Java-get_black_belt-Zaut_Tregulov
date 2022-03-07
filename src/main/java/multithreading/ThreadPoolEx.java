package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ThreadPoolEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " starts");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        System.out.println("---Fixed Thread pool begins");
        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyThread4());
        }
        executorService.shutdown();
        executorService.awaitTermination(10,TimeUnit.MINUTES);
        System.out.println("---Fixed Thread pool ends");
        System.out.println("---Single Thread pool begins");
        for (int i = 0; i < 10; i++) {
            executorService2.execute(new MyThread4());
        }
        executorService2.shutdown();
        executorService2.awaitTermination(10 ,TimeUnit.MINUTES);
        System.out.println("---Single Thread pool ends");
        System.out.println(Thread.currentThread().getName() + " ends");
    }

}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        System.out.println("starts " + Thread.currentThread().getName());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ends " + Thread.currentThread().getName());
    }
}
