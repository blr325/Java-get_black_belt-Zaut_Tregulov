package multithreading;

public class Exercise1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        Thread thread2 = new Thread(new MyThread2());
        Thread thread3 = new Thread(() -> {
            for (int i = -100; i < 0; i++) {
                System.out.println(i);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        new Thread(() -> System.out.println("Привет")).start();
        System.out.println("Пока");
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

