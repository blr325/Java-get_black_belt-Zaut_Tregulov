package multithreading;

public class SynchronizedEx implements Runnable {
    public static void main(String[] args) {
        SynchronizedEx myThread = new SynchronizedEx();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);
        System.out.println("Method main begins");
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nMethod main ends");


    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            Iteration.increaseCounter();
        }
    }
}

class Iteration {
    static int count = 0;

    public static synchronized void increaseCounter() {
        count++;
        System.out.print(Iteration.count + " ");
    }
}
