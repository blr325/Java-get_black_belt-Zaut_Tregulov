package multithreading;

public class SynchronizedEx2 {
    static int count = 0;
    static int count2 = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Increase());
        Thread thread2 = new Thread(new Increase());
        Thread thread3 = new Thread(new Increase2());
        Thread thread4 = new Thread(new Increase2());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronized methods, count = " + count);
        System.out.println("not synchronized methods, count2 = " + count2);
    }
}

class Increase implements Runnable {
    public static synchronized void increaseCounter(){
        SynchronizedEx2.count++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increaseCounter();
        }
    }
}

class Increase2 implements Runnable {
    public static void increaseCounter(){
        SynchronizedEx2.count2++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increaseCounter();
        }
    }
}
