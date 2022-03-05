package multithreading;

public class Exercise3 implements Runnable {
    @Override
    public void run() {
        System.out.println("Class Exercise3 begins");
        for (int i = 1; i < 4; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Class Exercise3 ends");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread1 = new Thread(new Exercise3());
        Thread thread2 = new Thread(new MyThread3());
        System.out.println("thread1.getState() = " + thread1.getState());
        System.out.println("thread2.getState() = " + thread2.getState());
        Thread.sleep(1000);
        thread1.start();
        System.out.println("thread1.getState() = " + thread1.getState());
        System.out.println("thread2.getState() = " + thread2.getState());
        thread1.join();
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().getState() = " + Thread.currentThread().getState());
        Thread.sleep(1000);
        System.out.println("thread1.getState() = " + thread1.getState());
        System.out.println("thread2.getState() = " + thread2.getState());
        Thread.sleep(1000);
        thread2.start();
        System.out.println("thread1.getState() = " + thread1.getState());
        System.out.println("thread2.getState() = " + thread2.getState());
        thread2.join();
        System.out.println("thread1.getState() = " + thread1.getState());
        System.out.println("thread2.getState() = " + thread2.getState());
        System.out.println("Method main ends");
    }
}

class MyThread3 implements Runnable {

    @Override
    public void run() {
        System.out.println("Class MyThread3 begins");
        for (int i = 1; i < 4; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Class MyThread3 ends");
    }
}

